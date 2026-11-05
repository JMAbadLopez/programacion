package ejercicio04_redsocial;

public class Main {
    public static void main(String[] args) {
        Tweet t = new Tweet("Jose", "Aprendiendo herencia en Java! #DAM #Java");
        Foto f = new Foto("Maria", "https://img.com/playa.jpg", "Sepia");
        Video v = new Video("Carlos", 60);

        t.darLike();
        t.darLike();
        f.darLike();

        System.out.println(t);
        System.out.println(f);
        System.out.println(v);
    }
}
