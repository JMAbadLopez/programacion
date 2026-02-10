package composicion;

public class Item {

    private String nombre;
    private int durabilidad;

    public Item(String nombre, int durabilidad) {
        this.nombre = nombre;
        this.durabilidad = durabilidad;
    }

    @Override
    public String toString() { return nombre + " [" + this.durabilidad + "%]"; }
}
