public class EjemploPasoReferencia {

    public static void main(String[] args) {
        int[] misNotas = {7, 5, 8};

        System.out.println("Notas originales: ");
        for (int i = 0; i < misNotas.length; i++ ) {
            System.out.println(misNotas[i]);
        }

        subirNotas(misNotas); // Le pasamos la DIRECCIÓN de misNotas

        System.out.println("Notas finales: ");
        for (int i = 0; i < misNotas.length; i++ ) {
            System.out.println(misNotas[i]);
        }// ¡Han cambiado! [8, 6, 9]
    }

    public static void subirNotas(int[] notas) { // Recibe la dirección del array
        System.out.println("Recibido. Subiendo un punto a cada nota...");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = notas[i] + 1; // Modificamos el array ORIGINAL
        }
    }
}
