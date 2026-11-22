package ejercicio08_notificaciones;

import java.util.ArrayList;

public class Alerta {
    private ArrayList<Notificable> canales;

    public Alerta() {
        this.canales = new ArrayList<>();
    }

    public void agregarCanal(Notificable n) {
        canales.add(n);
    }

    public void lanzarAlerta(String msg) {
        System.out.println("--- LANZANDO ALERTA ---");
        for (Notificable n : canales) {
            n.enviar(msg);
        }
        System.out.println("-----------------------");
    }
}
