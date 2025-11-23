import java.util.ArrayList;

public class EjemploWrapper {
    public static void main(String[] args) {
        // Declaración correcta usando el Wrapper Integer
        ArrayList<Integer> numeros = new ArrayList<>();

        // AUTOBOXING: El compilador convierte el primitivo 10 a new Integer(10)
        numeros.add(10);

        // UNBOXING: El compilador extrae el int del objeto Integer automáticamente
        int valor = numeros.get(0);

        System.out.println("Valor recuperado: " + valor);
    }
}