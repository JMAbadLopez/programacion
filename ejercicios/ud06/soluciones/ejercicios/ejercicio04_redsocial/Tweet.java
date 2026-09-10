package ejercicio04_redsocial;

public class Tweet extends Publicacion {
    private String texto;

    public Tweet(String usuario, String texto) {
        super(usuario);
        if (texto.length() > 280) {
            this.texto = texto.substring(0, 277) + "...";
            System.out.println("Mensaje recortado a 280 caracteres.");
        } else {
            this.texto = texto;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTweet: " + texto;
    }
}
