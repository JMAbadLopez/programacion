public class EjemplosFunciones {

    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public static double encontrarMaximo(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void saludar(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    /**
     * Calcula el área de un círculo a partir de su radio.
     *
     * @param radio El radio del círculo (debe ser un valor positivo).
     * @return El área calculada del círculo.
     */
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {

        int x = 2, y = 3;
        int suma, producto;
        String nombre;

        double maximo = encontrarMaximo(15.5, 9.2);

        suma = sumar(x, y);
        producto = multiplicar(x, y);

        System.out.println("La suma es " + suma);
        System.out.println("La multiplicación es " + producto);
        System.out.println("El máximo es " + maximo);
        
        nombre = "Iván";
        saludar("Álex");
        saludar(nombre);

    }
}
