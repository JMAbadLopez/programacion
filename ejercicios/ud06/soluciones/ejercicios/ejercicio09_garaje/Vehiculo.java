package ejercicio09_garaje;

public abstract class Vehiculo {
    protected String matricula;
    protected String marca;

    public Vehiculo(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public abstract double calcularPrecioParking(int minutos);

    @Override
    public String toString() {
        return marca + " [" + matricula + "]";
    }
}
