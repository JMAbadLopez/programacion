package ejercicio08_notificaciones;

public class SMS implements Notificable {
    private String telefono;

    public SMS(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS a [" + telefono + "]: " + mensaje);
    }
}
