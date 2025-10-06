package ejemplos;

import java.util.Scanner;

public class EjemploSwitch {

    public static void main(String[] args) {

        char vocal;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una vocal (en mayúscula): ");
        vocal = sc.next().charAt(0);
        sc.nextLine();

        switch(vocal) {
            case 'A':
                System.out.println("Es la A");
                break;
            case 'E':
                System.out.println("Es la E");
                break;
            case 'I':
                System.out.println("Es la I");
                break;
            case 'O':
                System.out.println("Es la O");
                break;
            case 'U':
                System.out.println("Es la U");
                break;
            default:
                System.out.println("No es una vocal");
        }
    }
}
