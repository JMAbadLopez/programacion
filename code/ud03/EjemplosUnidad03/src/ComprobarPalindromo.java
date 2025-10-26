public class ComprobarPalindromo {

    public static void main(String[] args) {
        String frase1 = "Se van sus naves";
        String frase2 = "Java mola";

        if (esPalindromoManual(frase1)) {
            System.out.println("'" + frase1 + "' es un palíndromo.");
        } else {
            System.out.println("'" + frase1 + "' NO es un palíndromo.");
        }

        if (esPalindromoManual(frase2)) {
            System.out.println("'" + frase2 + "' es un palíndromo.");
        } else {
            System.out.println("'" + frase2 + "' NO es un palíndromo.");
        }
    }

    /**
     * Función que comprueba si un String es palíndromo manualmente.
     * @param texto El String a comprobar.
     * @return true si es palíndromo, false en caso contrario.
     */
    public static boolean esPalindromoManual(String texto) {

        // 1. Limpiar y Normalizar (solo quitamos espacios)
        String textoEnMinusculas = texto.toLowerCase().trim();
        String limpio = ""; // String auxiliar para construir el texto sin espacios
        boolean esPalindromo = true;
        char aux;

        for (int i = 0; i < textoEnMinusculas.length(); i++) {
            aux = textoEnMinusculas.charAt(i);
            if (aux != ' ') {
                limpio = limpio + aux; // Concatenamos si no es espacio
            }
        }

        // 2. Comprobamos el primer char con el último (solo hasta la mitad)
        for (int i = 0; i < limpio.length()/2 && esPalindromo; i++) {
            if (limpio.charAt(i) != limpio.charAt(limpio.length() - 1 - i)) {
                esPalindromo = false;
            }
        }
        return esPalindromo;
    }
}