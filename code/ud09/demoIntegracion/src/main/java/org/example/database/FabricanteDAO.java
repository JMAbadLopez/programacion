package org.example.database;

import org.example.model.Fabricante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FabricanteDAO {
    private Connection con = ConexionBD.conectar();

    public boolean insertar(Fabricante fabricante) {
        String sql = "INSERT INTO fabricante (id_fabricante, nombre) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, fabricante.getIdFabricante());
            ps.setString(2, fabricante.getNombre());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Fabricante> obtenerTodos() {
        ArrayList<Fabricante> lista = new ArrayList<>();
        String sql = "SELECT id_fabricante, nombre FROM fabricante";
        
        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Fabricante fab = new Fabricante();
                fab.setIdFabricante(rs.getInt("id_fabricante"));
                fab.setNombre(rs.getString("nombre"));
                lista.add(fab);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public boolean actualizar(Fabricante fabricante) {
        String sql = "UPDATE fabricante SET nombre = ? WHERE id_fabricante = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, fabricante.getNombre());
            ps.setInt(2, fabricante.getIdFabricante());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar(int idFabricante) {
        String sql = "DELETE FROM fabricante WHERE id_fabricante = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idFabricante);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
