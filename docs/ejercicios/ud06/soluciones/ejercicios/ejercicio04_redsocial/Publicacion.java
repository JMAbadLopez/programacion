package ejercicio04_redsocial;

import java.time.LocalDateTime;

public class Publicacion {
    protected String usuario;
    protected LocalDateTime fecha;
    protected int likes;

    public Publicacion(String usuario) {
        this.usuario = usuario;
        this.fecha = LocalDateTime.now();
        this.likes = 0;
    }

    public void darLike() {
        likes++;
        System.out.println("¡Like! Total: " + likes);
    }

    @Override
    public String toString() {
        return "[" + usuario + " - " + fecha + "] Likes: " + likes;
    }
}
