package interfaces;

public class Perro implements Localizable {

    private String nombre;
    private Coordenadas collar;

    public Perro(String nombre, Coordenadas collar) {
        this.nombre = nombre;
        this.collar = collar;
    }

    @Override
    public double getLatitud() {
        return this.collar.lat;
    }

    @Override
    public double getLongitud() {
        return this.collar.lon;
    }

}
