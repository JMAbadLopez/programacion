package polimorfismo;

import java.util.ArrayList;

public class MainPolimorfismo {

    public static void main(String[] args) {

        ArrayList<Personaje> grupo = new ArrayList<>();

        grupo.add(new Guerrero("Conan", 100, 2, 10));
        grupo.add(new Mago("Gandalf", 120, 5, 10));

        Personaje enemigo = new Orco("Orokhur", 100, 2, 8);

        for (Personaje p : grupo) {
            p.atacar(enemigo);
        }

        Personaje p = grupo.get(0); // Recuperamos al primero (Sabemos que es Conan)
        // p.gritoDeGuerra(); // ERROR: La clase Personaje no tiene ese método.

        if(p instanceof Guerrero){
            /** Hacemos downcasting */
            Guerrero guerrero = (Guerrero)p;
            guerrero.gritoDeGuerra();
        }
    }
}
