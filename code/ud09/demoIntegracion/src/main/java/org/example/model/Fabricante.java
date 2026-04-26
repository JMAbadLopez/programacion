package org.example.model;

public class Fabricante {
    private int idFabricante;
    private String nombre;

    public Fabricante() {}
    public Fabricante(int idFabricante, String nombre) {
        this.idFabricante = idFabricante;
        this.nombre = nombre;
    }
    
    public int getIdFabricante() { return idFabricante; }
    public void setIdFabricante(int idFabricante) { this.idFabricante = idFabricante; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
