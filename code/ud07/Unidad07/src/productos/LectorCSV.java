package productos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorCSV {

    public static void main(String[] args) throws IOException {

        File ficheroCSV = new File("productos.csv");
        ArrayList<Producto> productos = new ArrayList<>();

        if (!ficheroCSV.exists()) {
            System.out.println("[EL ARCHIVO NO EXISTE]");
            ficheroCSV.createNewFile();
            System.out.println("[ARCHIVO CREADO: " + ficheroCSV.getPath() + "]");
        }

        Scanner sc = new Scanner(ficheroCSV);

        while (sc.hasNextLine()) {

            String lineaCSV = sc.nextLine();
            String[] linea = lineaCSV.split(";");

            String nombre = linea[0];
            double precio = Double.parseDouble(linea[1]);
            int cantidad = Integer.parseInt(linea[2]);

            Producto producto = new Producto(nombre, precio, cantidad);
            productos.add(producto);

        }

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        sc.close();

    }
}
