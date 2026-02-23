package ejercicio09_garaje;

public class Moto extends Vehiculo {
    public Moto(String matricula, String marca) {
        super(matricula, marca);
    }

    @Override
    public double calcularPrecioParking(int minutos) {
        return minutos * 0.01;
    }
}
