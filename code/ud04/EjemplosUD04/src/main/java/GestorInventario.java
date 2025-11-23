import java.util.ArrayList;
import java.util.Collections; // Utilidad para ordenar

public class GestorInventario {
    public static void main(String[] args) {
        // Instanciación de un ArrayList de Strings
        ArrayList<String> inventario = new ArrayList<>();

        // 1. Operaciones CRUD (Create, Read, Update, Delete)

        // CREATE: Añadir elementos
        inventario.add("Martillo");
        inventario.add("Destornillador");
        inventario.add("Taladro");
        inventario.add(0, "Sierra"); // Insertar al inicio (desplaza el resto)

        // READ: Acceso posicional
        System.out.println("Elemento en índice 2: " + inventario.get(2));

        // UPDATE: Modificar elementos
        inventario.set(1, "Martillo Neumático"); // Reemplaza "Martillo"

        // DELETE: Eliminar elementos
        inventario.remove("Taladro"); // Por objeto
        inventario.remove(0);         // Por índice ("Sierra")

        // 2. Operaciones de Utilidad
        System.out.println("¿Está vacío? " + inventario.isEmpty());
        System.out.println("Total de artículos: " + inventario.size());

        if (inventario.contains("Destornillador")) {
            System.out.println("El inventario contiene Destornillador.");
        }

        // Ordenación (usando la clase de utilidad Collections)
        Collections.sort(inventario);

        // 3. Iteración
        System.out.println("\n--- Inventario Actualizado ---");
        for (String articulo : inventario) {
            System.out.println("- " + articulo);
        }
    }
}
