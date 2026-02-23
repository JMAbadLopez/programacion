package model;

import java.util.ArrayList;
import java.util.Collections;

public class Gremio {
    private String nombre;
    private ArrayList<Personaje> miembros;

    public Gremio(String nombre) {
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
    }

    public void reclutar(Personaje p) {
        if (!miembros.contains(p)) {
            miembros.add(p);
            System.out.println(p.getNombre() + " se ha unido al gremio " + nombre);
        } else {
            System.out.println(p.getNombre() + " ya está en el gremio.");
        }
    }

    public void expulsar(Personaje p) {
        if (miembros.remove(p)) {
            System.out.println(p.getNombre() + " ha sido expulsado del gremio " + nombre);
        } else {
            System.out.println(p.getNombre() + " no pertenece a este gremio.");
        }
    }

    public void mostrarMiembros() {
        System.out.println("--- Miembros del Gremio: " + nombre + " ---");
        // Ordenación natural por agilidad (descendente) definida en Personaje.compareTo
        Collections.sort(miembros);
        for (Personaje p : miembros) {
            System.out.println(p);
        }
    }

    public ArrayList<Personaje> getMiembros() {
        return miembros;
    }
}
