import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // 1. Definimos los datos de conexión granulares como constantes de clase
    private static final String HOST = "localhost:5432";
    private static final String DB_NAME = "tienda_informatica";
    private static final String USUARIO = "dam";
    private static final String PASSWORD = "Dam2526";

    // Construimos la URL completa uniendo las variables
    private static final String URL = "jdbc:postgresql://" + HOST + "/" + DB_NAME;

    /**
     * Establece y devuelve una conexión con la base de datos
     */
    public static Connection conectar() {
        Connection conexion = null;
        try {
            System.out.println("Intentando conectar a la base de datos...");
            // Abrimos la comunicación usando nuestras constantes
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("¡Conexión establecida con éxito!");
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static void test() {

        System.out.println("Iniciando test de conexión...");
        try (Connection con = conectar()) {
            if (con != null) {
                System.out.println("=> La base de datos está lista para recibir comandos SQL.");
            }
        } catch (SQLException e) {
            System.err.println("Fallo inesperado al cerrar la base de datos: " + e.getMessage());
        }
    }
}