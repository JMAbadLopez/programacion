package ejercicio04_redsocial;

public class Video extends Publicacion {
    private int duracion; // en segundos

    public Video(String usuario, int duracion) {
        super(usuario);
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVideo de " + duracion + " segundos.";
    }
}
