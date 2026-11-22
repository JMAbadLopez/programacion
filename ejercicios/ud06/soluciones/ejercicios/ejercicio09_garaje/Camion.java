package ejercicio09_garaje;

public class Camion extends Vehiculo {
    public Camion(String matricula, String marca) {
        super(matricula, marca);
    }

    @Override
    public double calcularPrecioParking(int minutos) {
        return minutos * 0.04;
    }
}
