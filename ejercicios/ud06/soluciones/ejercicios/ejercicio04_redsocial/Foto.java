package ejercicio04_redsocial;

public class Foto extends Publicacion {
    private String urlImagen;
    private String filtro;

    public Foto(String usuario, String urlImagen, String filtro) {
        super(usuario);
        this.urlImagen = urlImagen;
        this.filtro = filtro;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFoto: " + urlImagen + " [Filtro: " + filtro + "]";
    }
}
