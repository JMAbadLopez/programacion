import java.util.Scanner;

public class NivelInicial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int numeroUsuario = 0;

        System.out.println("Bienvenido/a a ADIVINATOR");
        do {

            System.out.println("Introduce un número: ");
            numeroUsuario = sc.nextInt();
            sc.nextLine();

            if(numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor");
            } else if ( numeroUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor");
            } else {
                System.out.println("¡Enhorabuena has acertado el número!");
            }

        } while (numeroUsuario != numeroSecreto);

        sc.close();
    }
}
