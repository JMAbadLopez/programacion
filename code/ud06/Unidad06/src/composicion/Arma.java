package composicion;

public class Arma {
    private String nombre;
    private int dano;

    public Arma(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    public int getDano() { return dano; }
    public String getNombre() { return nombre; }
}