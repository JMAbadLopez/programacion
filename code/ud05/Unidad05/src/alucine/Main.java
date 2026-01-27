package alucine;

public class Main {

    public static void main(String[] args) {

        Sala sala = new Sala(1, "Gladiator II", "18:00");

        sala.mostrarSala();

        System.out.println(sala);

        sala.venderEntrada(0,0);
        sala.mostrarSala();

        sala.venderEntrada(0,1);
        sala.mostrarSala();

        System.out.println(sala);
        System.out.println("Recaudación total del cine: " + Sala.getRecaudacionTotal());
    }
}
