package interfaces;

public class Usuario implements Localizable {

    private String nombre;
    private int edad;
    private Coordenadas movil;

    public Usuario(String nombre, int edad, Coordenadas movil) {
        this.nombre = nombre;
        this.edad = edad;
        this.movil = movil;
    }

    @Override
    public double getLatitud() {
        return this.movil.lat;
    }

    @Override
    public double getLongitud() {
        return this.movil.lon;
    }

}
