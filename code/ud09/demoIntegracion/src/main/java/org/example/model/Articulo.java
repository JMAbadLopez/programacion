package org.example.model;

public class Articulo {
    private int idArticulo;
    private String nombre;
    private int precio; 
    private Fabricante fabricante; 

    public Articulo() {}
    public Articulo(int idArticulo, String nombre, int precio, Fabricante fabricante) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public int getIdArticulo() { return idArticulo; }
    public void setIdArticulo(int idArticulo) { this.idArticulo = idArticulo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }
    public Fabricante getFabricante() { return fabricante; }
    public void setFabricante(Fabricante fabricante) { this.fabricante = fabricante; }
}
