import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ActividadListas {

    public static void main(String[] args) {

        ArrayList<String> colores = new ArrayList<>();
        ArrayList<String> coloresCopia = new ArrayList<>();
        String c, colorIterador;

        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("amarillo");
        colores.add("blanco");
        colores.add("blanco");
        colores.add("negro");

        mostrarColores(colores);

        System.out.println("--- Cambio de primer elemento ---");
        colores.add(0,"amarillo");
        mostrarColores(colores);

        c = colores.get(2);
        System.out.println("* El color que ocupa la posición 2 es " + c);

        System.out.println("--- Antes de eliminar el 3r elemento ---");
        mostrarColores(colores);

        System.out.println("--- Después de eliminar el 3r elemento ---");
        colores.remove(3);
        mostrarColores(colores);

        Iterator<String> it = colores.iterator();
        while (it.hasNext()) {
            colorIterador = it.next();
            if (colorIterador.equals("blanco")) {
                it.remove();
                System.out.println("Se ha eliminado un elemento blanco");
            }
        }

        System.out.println("--- Colores ordenados ---");
        Collections.sort(colores);
        mostrarColores(colores);

        System.out.println("* Copiando colores... ---");
        copiarColores(colores, coloresCopia);
        System.out.println("--- Copia de colores ---");
        mostrarColores(coloresCopia);

        Collections.shuffle(colores);
        System.out.println("--- Mezclando colores ---");
        mostrarColores(colores);

        Collections.reverse(colores);
        System.out.println("--- Lista invertida ---");
        mostrarColores(colores);
    }


    public static void mostrarColores(ArrayList<String> colores){
        for(String color: colores){
            System.out.println(color);
        }
    }

    public static void copiarColores(ArrayList<String> src, ArrayList<String> dst){
        for(String color: src){
            dst.add(color);
        }
    }
}
