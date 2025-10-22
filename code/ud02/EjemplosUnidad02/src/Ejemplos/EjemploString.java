package ejemplos;

public class EjemploString {
    /**
     * Programa con ejemplos del Objeto String
     * @param args
     */
    public static void main(String[] args) {

        String texto1 = "¡Hola String!";
        String texto2 = "Este texto combina Mayúsculas y minúsculas";
        String texto3 = "prefijo";
        String texto4 = "     Este texto tiene muchos espacios  en blanco    ";
        String lista = "cerales,huevos,leche,sal";
        String mail = "jose@edu.com";
        int posicion = 0;
        boolean encontrado = false;

        // Recorrer un String con length() y charAt()
        for(int i = 0; i < texto1.length(); i++) {
            System.out.println("Caracter en la posición [" + i + "]: \"" + texto1.charAt(i) + "\"");
        }

        // Convertir texto a MAYÚSCULAS o minúsculas
        System.out.println(texto2.toUpperCase());
        System.out.println(texto2.toLowerCase());

        // Extraer una subcadena de texto
        System.out.println(texto3.substring(0,3));

        // Buscar posición texto
        // posicion = texto3.indexOf("fijo");
        posicion = texto3.indexOf("casa");
        if(posicion != -1 ) {
            System.out.println("Encontrado en la posición " + posicion);
        } else {
            System.out.println("No encontrado");
        }

        // Buscar si existe
        encontrado = texto3.contains("fijo");
        // encontrado = texto3.contains("casa");
        if(encontrado) {
            System.out.println("El subtexto se encuentra en el texto");
        } else {
            System.out.println("Subtexto no encontrado");
        }

        // Cambio de texto
        System.out.println("Cambio el dominio del mail " + mail + " por " + mail.replace(".com",".es"));

        // Limpieza de espacios en blanco
        System.out.println(texto4.trim());

        // Split de un texto en un array
        System.out.println("Convertimos el string en un array : \"" + lista + "\"");
        String[] ingredientes = lista.split(",");
        for( String ingrediente : ingredientes) {
            System.out.println(ingrediente);
        }
    }
}
