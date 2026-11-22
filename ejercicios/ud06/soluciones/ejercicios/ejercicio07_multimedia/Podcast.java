package ejercicio07_multimedia;

public class Podcast implements Reproducible {
    private String titulo;

    public Podcast(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo audio de podcast: " + titulo);
    }

    @Override
    public void pause() {
        System.out.println("Podcast pausado.");
    }

    @Override
    public void stop() {
        System.out.println("Cerrando reproductor de podcast.");
    }
}
