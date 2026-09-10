package model;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Personaje implements Atacable, Comparable<Personaje> {
    protected String nombre;
    protected int vida;
    protected int nivel;
    protected int agilidad;
    protected int resistencia;
    protected ArrayList<Item> mochila;

    public Personaje(String nombre, int vida, int nivel, int agilidad, int resistencia) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.agilidad = agilidad;
        this.resistencia = resistencia;
        this.mochila = new ArrayList<>();
    }

    public abstract void atacar(Personaje objetivo);

    public void cogerItem(Item i) {
        this.mochila.add(i);
        System.out.println(nombre + " ha cogido: " + i.getNombre());
    }

    protected int getBonusAtaque() {
        int total = 0;
        for (Item i : mochila) {
            total += i.getAumentoAtaque();
        }
        return total;
    }

    protected int getBonusDefensa() {
        int total = 0;
        for (Item i : mochila) {
            total += i.getAumentoDefensa();
        }
        return total;
    }

    @Override
    public void recibirDano(int dano) {
        int danoReal = dano - (resistencia + getBonusDefensa());
        if (danoReal < 0)
            danoReal = 0;

        this.vida -= danoReal;
        System.out.println(nombre + " recibe " + danoReal + " de daño. Vida restante: " + Math.max(0, vida));
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public int compareTo(Personaje o) {
        // Orden descendente por agilidad
        return Integer.compare(o.agilidad, this.agilidad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(nombre, personaje.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return String.format("%s (%s) | Nivel: %d | Vida: %d | Agilidad: %d | Resistencia: %d",
                nombre, getClass().getSimpleName(), nivel, vida, agilidad, resistencia);
    }

    // Getters for RPG logic
    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public int getAgilidad() {
        return agilidad;
    }
}
