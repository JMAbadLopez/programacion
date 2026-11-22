package ejercicio08_notificaciones;

public class Email implements Notificable {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo a [" + email + "]: " + mensaje);
    }
}
