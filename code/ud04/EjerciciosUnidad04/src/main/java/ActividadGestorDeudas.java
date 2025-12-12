import java.util.ArrayList;
import java.util.Scanner;

public class ActividadGestorDeudas {

    public static void main(String[] args) {

        ArrayList<String> clientes = new ArrayList<>();
        ArrayList<Double> deudas = new ArrayList<>();
        char opcion;

        Scanner sc = new Scanner(System.in);

        do {
            opcion = menu(sc);
            switch(opcion) {
                case 'A':
                    addCliente(clientes,deudas, sc);
                    break;
                case 'E':
                    deleteCliente(clientes, deudas, sc);
                    break;
                case 'D':
                    printClientes(clientes, deudas);
                    break;
                case 'C':
                    selectCliente(clientes, deudas, sc);
                    break;
                case 'M':
                    updateDeuda(clientes, deudas, sc);
                    break;
                case 'S':
                    clientes.clear();
                    deudas.clear();
                    System.out.println("Gracias por usar nuestro programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while(opcion!='S');

        System.out.println("FIN DEL PROGRAMA");

    }

    public static char menu(Scanner sc){
        char opcion;

        System.out.println("""
                A. Añadir cliente
                E. Eliminar cliente
                D. Consultar listado
                C. Consultar saldo cliente
                M. Modificar deuda
                S. Salir
                """);
        System.out.print("* Escoge una opción: ");
        opcion = sc.next().charAt(0);
        System.out.println();
        return opcion;
    }

    public static void addCliente(ArrayList<String> clientes,ArrayList<Double> deudas, Scanner sc){
        String cliente;
        Double deuda;

        System.out.print("* Ingrese el nombre del cliente: ");
        cliente = sc.next();
        clientes.add(cliente);

        System.out.print("* Ingrese la deuda del cliente: ");
        deuda = sc.nextDouble();
        sc.nextLine();

        deudas.add(deuda);

        System.out.println();
    }

    public static void deleteCliente(ArrayList<String> clientes,ArrayList<Double> deudas, Scanner sc){
        String cliente;
        int posicion;

        System.out.print("Ingrese el nombre del cliente: ");
        cliente = sc.next();

        if(clientes.contains(cliente)){
            posicion = clientes.indexOf(cliente);
            clientes.remove(cliente);
            deudas.remove(posicion);

            System.out.println("Cliente eliminado");
        } else {
            System.out.println("El cliente no existe");
        }
        System.out.println();
    }

    public static void printClientes(ArrayList<String> clientes,  ArrayList<Double> deudas){

        double total = 0;

        System.out.println("--- ESTADO DE DEUDAS ---");
        System.out.printf("%s %10s\n", "CLIENTE", "DEUDA");
        System.out.println("-----------------");
        for(int i = 0; i < clientes.size(); i++){
            System.out.printf("%s %15.2f €\n", clientes.get(i), deudas.get(i));
            total += deudas.get(i);
        }
        System.out.println("-----------------");
        System.out.printf("TOTAL DEUDA: %13.2f €\n",total);
    }

    public static void selectCliente(ArrayList<String> clientes,ArrayList<Double> deudas, Scanner sc){

        String cliente;
        int posicion;

        System.out.print("* Ingrese el nombre del cliente: ");
        cliente = sc.next();
        clientes.add(cliente);

        if(clientes.contains(cliente)){
            posicion = clientes.indexOf(cliente);
            System.out.printf("%s DEUDA: %6.2f€\n", cliente, deudas.get(posicion));
        } else {
            System.out.println("* El cliente no existe");
        }
    }

    public static void updateDeuda(ArrayList<String> clientes,  ArrayList<Double> deudas, Scanner sc){

        String cliente;
        Double nuevaDeuda;
        int posicion;

        System.out.print("* Ingrese el nombre del cliente: ");
        cliente = sc.next();

        if(clientes.contains(cliente)) {
            posicion = clientes.indexOf(cliente);

            System.out.print("* Ingrese la NUEVA deuda del cliente: ");
            nuevaDeuda = sc.nextDouble();
            sc.nextLine();

            deudas.set(posicion,nuevaDeuda);

            System.out.println("* DEUDA MODIFICADA");
         } else {
            System.out.println("* El cliente no existe");
        }
    }
}
