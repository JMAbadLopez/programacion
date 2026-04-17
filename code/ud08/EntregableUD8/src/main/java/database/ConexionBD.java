package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String HOST = "localhost:5432";
    private static final String DB_NAME = "bloc_notas";
    private static final String USUARIO = "dam";
    private static final String PASSWORD = "Dam2526";

    private static final String URL = "jdbc:postgresql://" + HOST + "/" + DB_NAME;

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }
}