package org.example.database;

import org.example.model.Articulo;
import org.example.model.Fabricante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArticuloDAO {
    private Connection con = ConexionBD.conectar();

    public boolean insertar(Articulo articulo) {
        String sql = "INSERT INTO articulo (id_articulo, nombre, precio, id_fab) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, articulo.getIdArticulo());
            ps.setString(2, articulo.getNombre());
            ps.setInt(3, articulo.getPrecio());
            ps.setInt(4, articulo.getFabricante().getIdFabricante()); 
            
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Articulo> obtenerTodos() {
        ArrayList<Articulo> lista = new ArrayList<>();
        String sql = "SELECT a.id_articulo, a.nombre AS nombre_art, a.precio, " +
                     "a.id_fab, f.nombre AS nombre_fab " +
                     "FROM articulo a INNER JOIN fabricante f ON a.id_fab = f.id_fabricante";
        
        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Fabricante fab = new Fabricante();
                fab.setIdFabricante(rs.getInt("id_fab"));
                fab.setNombre(rs.getString("nombre_fab"));
                
                Articulo art = new Articulo();
                art.setIdArticulo(rs.getInt("id_articulo"));
                art.setNombre(rs.getString("nombre_art"));
                art.setPrecio(rs.getInt("precio"));
                art.setFabricante(fab); 
                
                lista.add(art);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean actualizar(Articulo articulo) {
        String sql = "UPDATE articulo SET nombre = ?, precio = ?, id_fab = ? WHERE id_articulo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, articulo.getNombre());
            ps.setInt(2, articulo.getPrecio());
            ps.setInt(3, articulo.getFabricante().getIdFabricante());
            ps.setInt(4, articulo.getIdArticulo());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(int idArticulo) {
        String sql = "DELETE FROM articulo WHERE id_articulo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idArticulo);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
