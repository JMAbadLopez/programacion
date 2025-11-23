import java.util.ArrayList;

public class EjemploLista {
    public static void main(String[] args) {

        // Instanciación de un ArrayList de Strings
        ArrayList<String> miLista = new ArrayList<>();

        // Añadimos elementos a la lisda de manera ordenada
        miLista.add("Ana");
        miLista.add("Beto");
        miLista.add("Carla");
        miLista.add("Dani");

        // Iteración de una lista
        System.out.println("\n--- RECORRER ELEMENTOS DE UNA LISTA ---");
        for (String elemento : miLista) {
            System.out.println("- " + elemento);
        }

    }
}
