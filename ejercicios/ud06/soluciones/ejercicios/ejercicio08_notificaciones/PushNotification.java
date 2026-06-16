package ejercicio08_notificaciones;

public class PushNotification implements Notificable {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificación app: " + mensaje);
    }
}
