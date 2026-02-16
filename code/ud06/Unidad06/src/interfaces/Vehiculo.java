package interfaces;

public abstract class Vehiculo implements Localizable {

    protected Coordenadas gps;

    @Override
    public double getLatitud() {
        return this.gps.lat;
    }

    @Override
    public double getLongitud() {
        return this.gps.lon;
    }

}
