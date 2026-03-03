package file;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class CargarGremio {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("gremio.txt");
        Scanner sc = new Scanner(f);

        ArrayList<Personaje> listaAventureros = new ArrayList<>();

        // Mientras el archivo tenga más tokens...
        while (sc.hasNext()) {
            String nombre = sc.next();
            int nivel = sc.nextInt();
            double vida = sc.nextDouble();

            // Creamos el objeto y lo añadimos a la lista
            Personaje p = new Personaje(nombre, nivel, vida);
            listaAventureros.add(p);
        }

        sc.close();

        // Mostramos la lista recuperada
        System.out.println("--- AVENTUREROS RECUPERADOS ---");
        for (Personaje a : listaAventureros) {
            System.out.println(a);
        }
    }
}
