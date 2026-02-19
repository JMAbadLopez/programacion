package comparadores;

import java.util.Objects;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return this.precio; }
    public void setPrecio(double precio) {
        this.precio = (precio < 0) ? 0 : precio;
    }

    public int getStock() { return this.stock; }
    public void setStock(int stock) {
        this.stock = (stock < 0) ? 0 : stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return this.nombre.equals(producto.nombre);
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }

    @Override
    public int compareTo(Producto o) {
        //return Integer.compare(this.stock, o.stock);
        return Double.compare(this.precio, o.precio);
        //return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return this.nombre + " | " +  this.stock + " uds. | " +  this.precio +"€";
    }
}
