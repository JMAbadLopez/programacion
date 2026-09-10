package ejercicio10_orquesta;

public class Piano implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Plin plin... Suena el piano.");
    }

    public void afinarTecla() {
        System.out.println("Afinando tecla del piano...");
    }
}
