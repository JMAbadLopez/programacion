package file;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LectorAvanzado {
    public static void main(String[] args) throws FileNotFoundException {
        File archivoStats = new File("estadisticas_personaje.txt");

        // Inicializamos el analizador léxico conectándolo al archivo
        Scanner analizador = new Scanner(archivoStats);

        System.out.println("--- DECODIFICANDO ARCHIVO DE GUARDADO ---");

        // Verificamos y extraemos asegurando el tipo de dato
        if (analizador.hasNext()) {
            String nombrePersonaje = analizador.next(); // Extrae "Aragorn"
            System.out.println("Héroe: " + nombrePersonaje);
        }

        if (analizador.hasNextInt()) {
            int nivel = analizador.nextInt(); // Extrae "15" y lo convierte a entero
            System.out.println("Nivel actual: " + nivel);
        }

        if (analizador.hasNextDouble()) {
            double salud = analizador.nextDouble(); // Extrae "250,5" como decimal
            System.out.println("Puntos de Salud Máximos: " + salud);
        }

        // Liberamos los recursos del sistema operativo
        analizador.close();
        System.out.println("--- LECTURA FINALIZADA CON ÉXITO ---");
    }
}