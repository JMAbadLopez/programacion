package file;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CargarHeroe {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("heroe.txt"); // Contenido: "Geralt 30 250,5"
        Scanner sc = new Scanner(f);

        String nombre = null;
        int nivel = 0;
        double vida = 0;

        if (sc.hasNext()) {
            nombre = sc.next();
        }

        if (sc.hasNextInt()) {
            nivel = sc.nextInt();
        }

        if (sc.hasNextDouble()) {
            vida = sc.nextDouble();
        }

        Personaje p = new Personaje(nombre, nivel, vida);

        System.out.println("Objeto reconstruido con éxito:");
        System.out.println(p.toString());

        sc.close();
    }
}