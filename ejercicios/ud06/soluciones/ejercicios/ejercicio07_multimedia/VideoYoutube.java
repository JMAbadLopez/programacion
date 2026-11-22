package ejercicio07_multimedia;

public class VideoYoutube implements Reproducible {
    private String titulo;

    public VideoYoutube(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {
        System.out.println("Mostrando vídeo: " + titulo);
    }

    @Override
    public void pause() {
        System.out.println("Vídeo pausado.");
    }

    @Override
    public void stop() {
        System.out.println("Saliendo de YouTube.");
    }
}
