import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EjemploListaIterador {
    public static void main(String[] args) {
        // 1. Creación de la lista (vacía al principio)
        ArrayList<Double> notas = new ArrayList<>();
        double max = 0, min = 0;

        Double nota;

        // 2. Añadir datos al final (add)
        System.out.println("--- Añadiendo notas ---");
        notas.add(6.5);
        notas.add(4.2);
        notas.add(8.9);
        notas.add(5.0);
        notas.add(9.7);
        System.out.println("Notas iniciales: " + notas);

        // 3. INSERCIÓN EN MEDIO (add con índice)
        // Imaginemos que se nos olvidó una nota y debe ir en la segunda posición (índice 1)
        System.out.println("\n--- Insertando nota olvidada ---");
        notas.add(1, 7.5);
        // Ahora el 4.2 (que estaba en índice 1) se ha movido al 2
        System.out.println("Notas tras inserción: " + notas);

        // 4. Operaciones de lectura y cálculo
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Total de exámenes: " + notas.size());

        max = Collections.max(notas);
        min = Collections.min(notas);

        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);

        // 5. BORRADO CONDICIONAL (Uso de Iterator)
        // Queremos borrar TODAS las notas suspensas (menores que 5)
        System.out.println("\n--- Eliminando suspensos ---");

        //MAL USO DE BORRADO EN UNA LISTA
        /*
        for(Double n : notas) {
            if(n < 5.0) {
                notas.remove(n);
            }
        }
        */

        // Creamos el iterador
        Iterator<Double> it = notas.iterator();

        while(it.hasNext()) {         // Mientras queden elementos por visitar...
            nota = it.next();  // ...dame el siguiente

            if (nota < 5.0) {
                it.remove();          // ¡BORRADO SEGURO! El iterador gestiona el hueco
                System.out.println("Eliminada nota: " + nota);

            }
        }

        // 6. Resultado final
        System.out.println("\n--- Lista de Aprobados ---");
        System.out.println(notas);
    }
}
