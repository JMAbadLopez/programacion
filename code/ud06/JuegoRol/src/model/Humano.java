package model;

public class Humano extends Jugador {
    public Humano(String nombre, int vida, int attackPoints, int defensePoints) {
        super(nombre, vida, attackPoints, defensePoints);
        if (this.vida > 100) {
            this.vida = 100;
            System.out.println("La vida de un humano no puede superar 100. Ajustada a 100.");
        }
        System.out.println("He creado un " + this.getClass().getSimpleName());
    }

    // No tiene comportamientos especiales, usa los del padre
}
