import java.util.Scanner;

public class NivelAvanzado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroSecreto;
        int numeroUsuario = 0, contadorIntentosUsuario = 0, numeroIntentos = 0;
        int opcion = 0;
        boolean conLimite = false;


        System.out.println("Bienvenido/a a ADIVINATOR");

        do {
            /**
             * Menú de opciones del programa
             */
            System.out.println("1. Sin límite de intentos");
            System.out.println("2. Con límite de intentos");
            System.out.println("3. Salir");
            System.out.println("\nEscoge una opción de juego: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    conLimite = false;
                    /** Damos un valor a número de intentos aunque en esta modalidad no se use */
                    numeroIntentos = 10;
                    break;
                case 2:
                    conLimite = true;
                    break;
                case 3:
                    System.out.println("¡Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no correcta");
                    break;
            }
            /**
             * Si las opciones son la 1 o la 2, jugamos
             */
            if(opcion == 1 || opcion == 2) {
                /* Inicializamos el número secreto en cada juego */
                numeroSecreto = (int) (Math.random() * 100) + 1;
                System.out.println("[PISTA] " +  numeroSecreto);
                /**
                 * Si el usuario quiere jugar con límite de intentos, solicitamos el límite
                 */
                if(conLimite) {
                    /**
                     * Solicitamos en cuántos intentos
                     */
                    System.out.println("¿En cuántos intentos quieres como máximo? ");
                    numeroIntentos = sc.nextInt();
                    sc.nextLine();

                    /**
                     * Inicializamos los números de intentos reales del usuario
                     */
                    contadorIntentosUsuario = 0;
                }

                do {

                    System.out.println("Introduce un número: ");
                    numeroUsuario = sc.nextInt();
                    sc.nextLine();

                    if (numeroUsuario < numeroSecreto) {
                        System.out.println("El número secreto es mayor");
                    } else if (numeroUsuario > numeroSecreto) {
                        System.out.println("El número secreto es menor");
                    } else {
                        System.out.println("¡Enhorabuena has acertado el número!");
                        if(conLimite) System.out.println("Has necesitado: "+ (contadorIntentosUsuario+1) +" intento/s\n");
                    }
                    /**
                     * Si está jugando con límite actualizamos el contador de intentos
                     */
                    if(conLimite) {
                        contadorIntentosUsuario++;
                    }

                } while (numeroUsuario != numeroSecreto && contadorIntentosUsuario < numeroIntentos);

                if(conLimite && contadorIntentosUsuario == numeroIntentos) {
                    System.out.println("\nLo siento, no has acertado el número dentro del límite de intentos\n");
                }
            }
        } while (opcion != 3);

        System.out.println("Final del programa");
    }
}
