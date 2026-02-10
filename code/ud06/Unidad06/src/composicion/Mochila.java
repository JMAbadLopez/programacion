package composicion;

import java.util.ArrayList;

public class Mochila {

    private ArrayList<Item> items;
    private int capacidadMax;

    public Mochila(int capacidad) {
        this.capacidadMax = capacidad;
        this.items = new ArrayList<>();
    }

    public void guardar(Item i) {
        if(this.items.size() < this.capacidadMax) {
            this.items.add(i);
            System.out.println("Guardado: " + i);
        } else {
            System.out.println("No cabe: " + i);
        }
    }

    public String listar() {
        return this.items.toString();
    }
}
