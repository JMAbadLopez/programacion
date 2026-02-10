package herencia;

public class MainHerencia {

    public static void main(String[] args) {

        Personaje generico;
        Guerrero conan;

        generico = new Personaje("Genaro", 20);
        conan = new Guerrero("Conan", 30, 100);

        generico.saludar();
        conan.saludar();

    }
}
