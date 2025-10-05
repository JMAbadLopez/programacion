import java.util.Scanner;

public class NivelIntermedio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int numeroUsuario = 0, contadorIntentosUsuario = 0;

        final int NUM_INTENTOS = 5;

        System.out.println("Bienvenido/a a ADIVINATOR");
        do {

            System.out.println("Introduce un número: ");
            numeroUsuario = sc.nextInt();
            sc.nextLine();

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor");
            } else {
                System.out.println("¡Enhorabuena has acertado el número en "+ (contadorIntentosUsuario+1) +" intento/s!");
            }

            contadorIntentosUsuario++;

        } while (numeroUsuario != numeroSecreto && contadorIntentosUsuario < NUM_INTENTOS);

        if(contadorIntentosUsuario >= NUM_INTENTOS){
            System.out.println("Lo siento, no has adivinado el número");
        }
    }
}
