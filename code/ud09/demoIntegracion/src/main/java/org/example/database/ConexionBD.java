package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String HOST = "localhost:5432";
    private static final String DB_NAME = "tienda_informatica";
    private static final String USUARIO = "dam";
    private static final String PASSWORD = "Dam2526";

    private static final String URL = "jdbc:postgresql://" + HOST + "/" + DB_NAME;

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
}