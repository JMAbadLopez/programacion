package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

class Personaje {

    private String nombre;
    private int nivel;
    private double puntosVida;

    public Personaje(String nombre, int nivel, double puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(double puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void recibirCura(double puntos) {
        this.puntosVida += puntos;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void mostrarInfo() {
        System.out.printf("Héroe: %s | Nivel: %d | Salud: %.1f\n", nombre, nivel, puntosVida);
    }

    @Override
    public String toString() {
        return "Héroe: " + this.nombre + " | Nivel: " + this.nivel + " | Puntos vida: " + this.puntosVida;
    }

    public void guardarPartida(File archivoDestino) throws FileNotFoundException {
        PrintStream escritor = new PrintStream(archivoDestino);

        // Guardamos los datos en un orden estricto y predecible
        escritor.println(this.nombre);
        escritor.println(this.nivel);
        escritor.println(this.puntosVida);

        escritor.close();
    }

    public static Personaje cargarPartida(File archivoOrigen) throws FileNotFoundException {

        Scanner lector = new Scanner(archivoOrigen);

        // Debemos extraer los datos exactamente en el mismo orden en que se guardaron
        String nom = lector.nextLine();
        int niv = Integer.parseInt(String.valueOf(lector.nextInt()));
        double puntosVida = lector.nextDouble();

        lector.close();

        // Utilizamos el constructor estándar con los datos recuperados del disco
        return new Personaje(nom, niv, puntosVida);
    }
}
