package ejercicio10_orquesta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrumento> orquesta = new ArrayList<>();

        orquesta.add(new Piano());
        orquesta.add(new Guitarra());
        orquesta.add(new Violin());
        orquesta.add(new Piano());

        for (Instrumento i : orquesta) {
            i.tocar();
            if (i instanceof Piano) {
                ((Piano) i).afinarTecla();
            }
        }
    }
}
