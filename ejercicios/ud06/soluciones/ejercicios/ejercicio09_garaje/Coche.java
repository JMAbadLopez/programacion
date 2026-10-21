package ejercicio09_garaje;

public class Coche extends Vehiculo {
    public Coche(String matricula, String marca) {
        super(matricula, marca);
    }

    @Override
    public double calcularPrecioParking(int minutos) {
        return minutos * 0.02;
    }
}
