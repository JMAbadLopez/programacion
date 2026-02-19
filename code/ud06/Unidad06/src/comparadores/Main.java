package comparadores;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> almacen = new ArrayList();

        Producto pr1 = new Producto("Agua mineral 1l.", 0.70, 100);
        Producto pr2 = new Producto("Pan de centeno", 2.35, 80);
        Producto pr3 = new Producto("Tomate cherry", 3.50, 50);

        almacen.add(pr1);
        almacen.add(pr2);
        almacen.add(pr3);

        /** Compara el objeto */
        if(almacen.get(0).equals(almacen.get(1))) {
            System.out.println("Es el mismo producto");
        }

        Collections.sort(almacen);

        for(Producto pr : almacen) {
            System.out.println(pr);
        }
    }
}
