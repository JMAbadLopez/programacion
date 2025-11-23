package entregables;

import java.util.Scanner;

public class AnalisisFacturacion {

    public static void main(String[] args) {

        final int NUM_FACTURAS = 5;

        Scanner teclado = new Scanner(System.in);

        int[] codigos = new int[NUM_FACTURAS];
        int[] litros = new int[NUM_FACTURAS];
        double[] precio = new double[NUM_FACTURAS];

        double facturacionTotal = 0.0;
        int cantidadLitros = 0;
        int numFacturas = 0;

        System.out.println("--- ENTRADA DE DATOS ---");
        for(int i = 0; i < NUM_FACTURAS; i++){
            System.out.println("PRODUCTO[" + i + "]");

            System.out.println("- Código producto: ");
            codigos[i] = teclado.nextInt();
            teclado.nextLine();

            System.out.println("- Litros: ");
            litros[i] = teclado.nextInt();
            teclado.nextLine();

            System.out.println("- Precio por litro: ");
            precio[i] = teclado.nextDouble();
            teclado.nextLine();
        }

        for(int i = 0; i < NUM_FACTURAS; i++){

            if(codigos[i] == 1){
                cantidadLitros += litros[i];
            }

            if((litros[i]*precio[i]) > 200) {
                numFacturas++;
            }

            facturacionTotal += precio[i] * litros[i];
        }

        System.out.println("--- RESUMEN DE VENTAS ---");
        System.out.println("* Facturación total : " +  facturacionTotal + " €");
        System.out.println("* Cantidad de litros vendidos del artículo #1 : " +  cantidadLitros);
        System.out.println("* Número de facturas de más de 200 € : " +  numFacturas);
    }
}
