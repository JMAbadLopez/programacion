package model;

import java.util.ArrayList;
import java.util.Objects;
import exceptions.JuegoRolException;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void addJugador(Jugador j) throws JuegoRolException {
        if (jugadores.contains(j)) {
            throw new JuegoRolException("El jugador " + j.getNombre() + " ya está en el equipo " + this.nombre);
        }
        jugadores.add(j);
        // Evitar recursión infinita: solo añadimos el equipo al jugador si no lo tiene
        // ya
        if (!j.getEquipos().contains(this)) {
            j.addEquipo(this);
        }
    }

    public void removeJugador(Jugador j) throws JuegoRolException {
        if (!jugadores.contains(j)) {
            throw new JuegoRolException("El jugador " + j.getNombre() + " no está en el equipo " + this.nombre);
        }
        jugadores.remove(j);
        if (j.getEquipos().contains(this)) {
            j.removeEquipo(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo ").append(nombre).append(":\n");
        for (Jugador j : jugadores) {
            sb.append("\t").append(j.toString()).append("\n");
        }
        return sb.toString();
    }
}
