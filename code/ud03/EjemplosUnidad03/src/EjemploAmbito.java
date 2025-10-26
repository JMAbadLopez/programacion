public class EjemploAmbito {

    public static void main(String[] args) {
        int variableMain = 10; // Una variable en el "pasillo" del hotel (main)
        miFuncion();
        // System.out.println(variableDeFuncion); // ¡ERROR! No puedes ver dentro de la habitación desde el pasillo.
    }

    public static void miFuncion() { // Entras a la "habitación"
        int variableDeFuncion = 20; // Una variable dentro de la habitación
        System.out.println(variableDeFuncion); // Correcto, puedes usarla aquí dentro.
        // System.out.println(variableMain); // ¡ERROR! Desde dentro de la habitación no ves lo que hay en el pasillo.
    }
}
