package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MotorJuego {
    public static void main(String[] args) throws FileNotFoundException {

        File archivoSave = new File("savegame.txt");
        Personaje jugador;

        System.out.println("--- INICIANDO SISTEMA ---");

        // 1 y 2. FASE DE CARGA (Input)
        if (archivoSave.exists()) {
            System.out.println("Archivo de guardado detectado. Restaurando sesión...");
            // Llamamos al método estático para que nos devuelva el objeto montado
            jugador = Personaje.cargarPartida(archivoSave);
        } else {
            System.out.println("No hay partidas previas. Creando nueva sesión...");
            try {
                archivoSave.createNewFile();
            } catch (IOException e) {
                System.err.println("Error crítico de E/S al intentar crear el archivo: " + e.getMessage());
            } finally {
                jugador = new Personaje("Guerrero Novato", 1, 100.0);
            }
        }

        // Mostramos el estado en RAM
        jugador.mostrarInfo();

        // 4. FASE DE JUEGO (Modificación en RAM)
        System.out.println("\n[EVENTO] Has descansado en la posada y entrenado duro.");
        jugador.recibirCura(25.5);
        jugador.subirNivel();

        jugador.mostrarInfo();

        // 5. FASE DE GUARDADO (Output)
        System.out.println("\nGuardando progreso en el disco...");
        // Le pedimos al propio objeto que se guarde a sí mismo
        if(archivoSave.exists()) {
            jugador.guardarPartida(archivoSave);
        }

        System.out.println("Sistema apagado con éxito.");
    }
}
