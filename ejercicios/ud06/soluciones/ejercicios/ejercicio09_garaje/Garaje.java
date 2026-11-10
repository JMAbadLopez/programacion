package ejercicio09_garaje;

import java.util.ArrayList;

public class Garaje {
    private ArrayList<Vehiculo> vehiculos;

    public Garaje() {
        this.vehiculos = new ArrayList<>();
    }

    public void entrar(Vehiculo v) {
        vehiculos.add(v);
        System.out.println("Entrada: " + v);
    }

    public void salir(Vehiculo v, int minutos) {
        if (vehiculos.remove(v)) {
            double precio = v.calcularPrecioParking(minutos);
            System.out.println(
                    "Salida: " + v + " | Tiempo: " + minutos + " min | Precio: " + String.format("%.2f", precio) + "€");
        } else {
            System.out.println("El vehículo " + v + " no está en el garaje.");
        }
    }
}
