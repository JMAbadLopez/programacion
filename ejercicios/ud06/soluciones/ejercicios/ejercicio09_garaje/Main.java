package ejercicio09_garaje;

public class Main {
    public static void main(String[] args) {
        Garaje pacoGaraje = new Garaje();

        Coche c = new Coche("1234ABC", "Seat");
        Moto m = new Moto("5678DEF", "Honda");
        Camion ca = new Camion("9012GHI", "Volvo");

        pacoGaraje.entrar(c);
        pacoGaraje.entrar(m);
        pacoGaraje.entrar(ca);

        System.out.println("--- Turno de salida ---");
        pacoGaraje.salir(c, 60);
        pacoGaraje.salir(m, 30);
        pacoGaraje.salir(ca, 120);
    }
}
