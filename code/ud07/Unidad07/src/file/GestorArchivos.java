package file;

import java.io.File;
import java.io.IOException;

public class GestorArchivos {
    public static void main(String[] args) {
        // Utilizamos una ruta relativa para mayor portabilidad
        File miArchivo = new File("configuracion_juego.txt");

        System.out.println("--- ANÁLISIS DEL SISTEMA DE ARCHIVOS ---");
        System.out.println("Ruta absoluta resuelta: " + miArchivo.getAbsolutePath());

        if (miArchivo.exists()) {
            System.out.println("Estado: El recurso EXISTE en el almacenamiento.");

            if (miArchivo.isFile()) {
                System.out.println("Tipo: Es un FICHERO de datos.");
                System.out.println("Tamaño: " + miArchivo.length() + " bytes.");
            } else if (miArchivo.isDirectory()) {
                System.out.println("Tipo: Es un DIRECTORIO.");
            }
        } else {
            System.out.println("Estado: El recurso NO EXISTE. Procediendo a instanciarlo físicamente...");

            try {
                // Invocamos al SO para crear el archivo en disco
                boolean creado = miArchivo.createNewFile();

                if (creado) {
                    System.out.println("Éxito: Archivo materializado correctamente en el disco.");
                }
            } catch (IOException e) {
                // Interceptamos posibles errores (ej. permisos insuficientes)
                System.err.println("Error crítico de E/S al intentar crear el archivo: " + e.getMessage());
            }
        }
    }
}