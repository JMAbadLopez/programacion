package productos;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.setPrecio(precio);
        this.setCantidad(cantidad);
    }

    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return this.precio; }
    public void setPrecio(double precio) {
        if(precio < 0) {
            precio = 0;
        } this.precio = precio;
    }

    public int getCantidad() { return this.cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            cantidad = 0;
        }
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Precio: " + this.precio + "€ | Cantidad: " + this.cantidad;
    }
}
