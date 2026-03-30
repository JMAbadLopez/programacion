import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PruebaCRUD {

    public static void main(String[] args) {

        // 1. Iniciamos la conexión ayudándonos de la clase que creamos en el punto 4
        try (Connection con = ConexionBD.conectar()) {

            if (con == null) {
                System.out.println("No se pudo establecer el túnel con la Base de Datos.");
                return;
            }

            System.out.println("\n--- INICIANDO CICLO CRUD ---");

            // A) CREATE: Insertamos una nueva fila
            String sqlInsert = "INSERT INTO articulos (id_articulo, nombre, precio, id_fab) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = con.prepareStatement(sqlInsert)) {
                pstmt.setInt(1, 999); // Inventamos un super ID
                pstmt.setString(2, "Teclado Mecánico RGB");
                pstmt.setInt(3, 120);
                pstmt.setInt(4, 3);   // Asumimos que el fabricante 3 es Logitech

                int insertadas = pstmt.executeUpdate();
                System.out.println("CREATE -> Filas insertadas: " + insertadas);
            }

            // B) READ: Leemos el artículo que acabamos de guardar
            String sqlSelect = "SELECT id_articulo, nombre, precio FROM articulos WHERE id_articulo = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sqlSelect)) {
                pstmt.setInt(1, 999);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        System.out.println("READ -> Encontrado ID " + rs.getInt("id_articulo") +
                                ": " + rs.getString("nombre") + " por " + rs.getInt("precio") + "€");
                    } else {
                        System.out.println("Error: No se ha encontrado el nuevo producto.");
                    }
                }
            }

            // C) UPDATE: Vamos a aplicarle una rebaja y cambiarle el nombre
            String sqlUpdate = "UPDATE articulos SET nombre = ?, precio = ? WHERE id_articulo = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sqlUpdate)) {
                pstmt.setString(1, "Teclado Mecánico RGB II");
                pstmt.setInt(2, 90);  // Nuevo precio
                pstmt.setInt(3, 999); // ID del objeto que queremos modificar

                int actualizadas = pstmt.executeUpdate();
                System.out.println("UPDATE -> Filas modificadas: " + actualizadas);
            }

            // D) DELETE: Probado que todo funciona, limpiamos la base de datos para no ensuciar
            String sqlDelete = "DELETE FROM articulos WHERE id_articulo = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sqlDelete)) {
                pstmt.setInt(1, 999);

                int borradas = pstmt.executeUpdate();
                System.out.println("DELETE -> Filas eliminadas con éxito: " + borradas);
            }

            System.out.println("--- PRUEBA CRUD FINALIZADA ---");

        } catch (SQLException e) {
            System.err.println("Fallo fatal de base de datos interrumpiendo el flujo: " + e.getMessage());
        }
    }
}