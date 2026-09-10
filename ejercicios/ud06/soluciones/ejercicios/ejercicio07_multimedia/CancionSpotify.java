package ejercicio07_multimedia;

public class CancionSpotify implements Reproducible {
    private String titulo;
    private String artista;

    public CancionSpotify(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo canción de rock: " + titulo + " by " + artista);
    }

    @Override
    public void pause() {
        System.out.println("Pausando canción: " + titulo);
    }

    @Override
    public void stop() {
        System.out.println("Deteniendo Spotify.");
    }
}
