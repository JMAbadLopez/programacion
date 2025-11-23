package entregables;

import java.util.Scanner;

public class CooperativaNaranjas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double precioInicial = 0.0, precioFinal = 0.0;
        char tipoNaranja;
        int tamanyoNaranja;

        System.out.println("--- COOPERATIVA CASABLANCA: CALCULADORA DE PRECIOS ---");
        System.out.println("Introduce los siguientes datos: ");
        System.out.println("- Precio inicial del kilo de naranja");
        precioInicial = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("- Tipo de naranja (A|B):");
        tipoNaranja = teclado.nextLine().charAt(0);

        System.out.println("- Tamaño de la naranja (1|2):");
        tamanyoNaranja = teclado.nextInt();
        teclado.nextLine();

        if(tipoNaranja == 'A'){
            if(tamanyoNaranja == 1){
                precioFinal = precioInicial + 0.10;
            } else {
                precioFinal = precioInicial + 0.25;
            }
        } else {
            if(tamanyoNaranja == 2){
                precioFinal = precioInicial - 0.05;
            } else {
                precioFinal = precioInicial - 0.10;
            }
        }

        System.out.println("--- RESULTADO ---");
        System.out.println("El precio final de venta es " + precioFinal + " €/kg");
    }

}
