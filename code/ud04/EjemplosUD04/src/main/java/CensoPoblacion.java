import java.util.HashMap;
import java.util.Map;

public class CensoPoblacion {
    public static void main(String[] args) {
        HashMap<String, String> censo = new HashMap<>();

        // 1. Inserción (put)
        censo.put("1111A", "Ana López");
        censo.put("2222B", "Carlos Ruiz");

        // Sobrescritura si la clave existe
        censo.put("1111A", "Ana López García");

        // 2. Recuperación (get)
        System.out.println("Nombre: " + censo.get("2222B"));

        System.out.println("EntrySet: " + censo.entrySet());

        System.out.println("KeySet: " + censo.keySet());
        System.out.println("Values: " + censo.values());


        // 3. Recorrido eficiente
        for (Map.Entry<String, String> entrada : censo.entrySet()) {
            System.out.println("DNI: " + entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}