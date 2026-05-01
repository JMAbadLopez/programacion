package ejercicio07_multimedia;

public class Main {
    public static void main(String[] args) {
        Reproducible[] lista = {
                new CancionSpotify("Bohemian Rhapsody", "Queen"),
                new VideoYoutube("Tutorial Java Avanzado"),
                new Podcast("The Joe Rogan Experience")
        };

        for (Reproducible r : lista) {
            r.play();
            r.pause();
            r.stop();
            System.out.println("---");
        }
    }
}
