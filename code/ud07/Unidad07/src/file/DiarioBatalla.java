package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class DiarioBatalla {
    public static void main(String[] args) throws FileNotFoundException {
        File archivoLog = new File("registro_combates.txt");

        // 1. Configuramos el flujo en modo APPEND (true)
        // Usamos FileOutputStream como puente para activar la inserción al final
        FileOutputStream puente = new FileOutputStream(archivoLog, true);
        PrintStream escritor = new PrintStream(puente);

        System.out.println("--- REGISTRANDO EVENTOS EN EL DISCO ---");

        // 2. Escribimos usando diferentes formatos
        escritor.println("=====================================");
        escritor.println("NUEVA SESIÓN DE JUEGO INICIADA");

        String heroe = "Aragorn";
        String enemigo = "Orco Feo";
        int dano = 45;

        // Uso de printf para texto estructurado
        escritor.printf("[COMBATE] %s ha atacado a %s.\n", heroe, enemigo);
        escritor.printf("[DAÑO] Se han infligido %d puntos de daño.\n", dano);

        // 3. Cerramos el flujo para forzar el guardado (flush) y liberar el archivo
        escritor.close();

        System.out.println("Eventos guardados correctamente en el registro.");
    }
}