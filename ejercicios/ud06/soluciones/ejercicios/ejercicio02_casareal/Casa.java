package ejercicio02_casareal;

import java.util.ArrayList;
import java.util.Iterator;

public class Casa {
    private ArrayList<Habitacion> habitaciones;

    public Casa() {
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void borrarHabitacion(String nombre) {
        Iterator<Habitacion> it = habitaciones.iterator();
        while (it.hasNext()) {
            Habitacion h = it.next();
            if (h.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
            }
        }
    }

    public double getMetrosTotales() {
        double total = 0;
        for (Habitacion h : habitaciones) {
            total += h.getMetrosCuadrados();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Casa con habitaciones:\n");
        for (Habitacion h : habitaciones) {
            sb.append("- ").append(h).append("\n");
        }
        sb.append("Total metros: ").append(getMetrosTotales()).append(" m²");
        return sb.toString();
    }
}
