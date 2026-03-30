// Archivo: ArticuloDAO.java
import java.sql.*;
import java.util.ArrayList;

public class ArticuloDAO {

    // MÉTODO READ: Devuelve objetos, NO ResultSets
    public ArrayList<Articulo> obtenerTodos() {
        ArrayList<Articulo> lista = new ArrayList<>();
        String sql = "SELECT id_articulo, nombre, precio, id_fab FROM articulos";

        // Abrimos la tubería en el propio DAO mediante nuestra clase de apoyo ConexionBD
        try (Connection con = ConexionBD.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // Traducimos de Relacional a Orientado a Objetos (Mapeo)
                Articulo a = new Articulo(
                        rs.getInt("id_articulo"),
                        rs.getString("nombre"),
                        rs.getInt("precio"),
                        rs.getInt("id_fab")
                );
                lista.add(a); // Añadimos a la lista
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener artículos: " + e.getMessage());
        }
        return lista;
    }

    // MÉTODO CREATE: Recibe un objeto y lo guarda
    public boolean insertar(Articulo art) {
        String sql = "INSERT INTO articulos (id_articulo, nombre, precio, id_fab) VALUES (?, ?, ?, ?)";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setInt(1, art.getIdArticulo());
            pstmt.setString(2, art.getNombre());
            pstmt.setInt(3, art.getPrecio());
            pstmt.setInt(4, art.getIdFabricante());

            return pstmt.executeUpdate() > 0; // Devuelve true si afectó a alguna fila
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
            return false;
        }
    }
}