import java.util.Scanner;

public class Patron {
    public static void main(String[] args) {

        int numLineas = 0;
        char caracter;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de líneas: ");
        numLineas = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el caracter: ");
        caracter = sc.next().charAt(0);


        piramide(numLineas, caracter);

    }

    public static void piramide(int numLineas, char c) {
        if (numLineas != 0) {
            for (int i = 0; i < numLineas; i++) {
                for (int j = 0; j < numLineas-i-1; j++) {
                    System.out.print(' ');
                }
                for (int k = 0; k < (i+1)*2-1; k++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }
}
