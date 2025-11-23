package entregables;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {

        int[] billetes = {500,200,100,50,20,10,5};
        double saldo = 0.0, ingreso =  0.0, retiro = 0.0;
        int opcion = 0, numBilletes;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("---- MENÚ CAJERO AUTOMÁTICO ----");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Escoge una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + saldo + " €");
                    break;
                case 2:
                    System.out.print("Cantidad a ingresar: ");
                    ingreso = sc.nextDouble();
                    sc.nextLine();

                    saldo += ingreso;
                    System.out.println("Saldo actual: " + saldo + " €");
                    break;

                case 3:
                    System.out.print("Cantidad a retirar: ");
                    retiro = sc.nextDouble();
                    sc.nextLine();

                    if(retiro > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Desglose de billetes entregados:");
                        saldo -= retiro;
                        for(int i = 0; i < billetes.length || retiro < 0; i++){
                            numBilletes = (int) retiro/billetes[i];
                            if(numBilletes > 0){
                                retiro = retiro%billetes[i];
                                System.out.println("- " + numBilletes + " billete/s de " + billetes[i]+ " €");
                            }
                        }
                        System.out.println("Operación realizada con éxito.");
                        System.out.println("Saldo actual: " + saldo + " €");
                    }
                    break;

                case 4:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }

        } while (opcion != 4);
        sc.close();
    }
}
