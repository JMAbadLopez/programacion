package model;

public class Item {
    private String nombre;
    private int aumentoAtaque;
    private int aumentoDefensa;

    public Item(String nombre, int aumentoAtaque, int aumentoDefensa) {
        this.nombre = nombre;
        this.aumentoAtaque = aumentoAtaque;
        this.aumentoDefensa = aumentoDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAumentoAtaque() {
        return aumentoAtaque;
    }

    public int getAumentoDefensa() {
        return aumentoDefensa;
    }

    @Override
    public String toString() {
        return String.format("%s (Atq: +%d, Def: +%d)", nombre, aumentoAtaque, aumentoDefensa);
    }
}
