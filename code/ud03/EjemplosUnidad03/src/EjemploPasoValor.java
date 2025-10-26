public class EjemploPasoValor {

    public static void main(String[] args) {
        int miNumero = 10;
        System.out.println("Antes de llamar a la función, miNumero vale: " + miNumero); // Vale 10

        intentarModificar(miNumero); // Le pasamos una FOTOCOPIA de miNumero

        System.out.println("Después de llamar a la función, miNumero vale: " + miNumero); // Sigue valiendo 10
    }

    public static void intentarModificar(int numeroCopia) { // Recibe la fotocopia
        numeroCopia = numeroCopia * 2; // Modificamos la COPIA a 20
        System.out.println("Dentro de la función, la copia vale: " + numeroCopia); // Vale 20
    }
}
