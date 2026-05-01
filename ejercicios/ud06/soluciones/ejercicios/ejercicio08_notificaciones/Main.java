package ejercicio08_notificaciones;

public class Main {
    public static void main(String[] args) {
        Alerta alertaSeguridad = new Alerta();

        alertaSeguridad.agregarCanal(new Email("admin@empresa.com"));
        alertaSeguridad.agregarCanal(new SMS("600111222"));
        alertaSeguridad.agregarCanal(new PushNotification());

        alertaSeguridad.lanzarAlerta("¡Intento de acceso no autorizado detectado!");
    }
}
