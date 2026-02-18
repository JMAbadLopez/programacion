package polimorfismo;

import java.util.ArrayList;

public class MainPolimorfismo {

    public static void main(String[] args) {

        ArrayList<Personaje> grupo = new ArrayList<>();

        Guerrero guerrero = new Guerrero("Conan", 100, 2, 10);

        grupo.add(guerrero);

        grupo.add(new Mago("Gandalf", 120, 5, 10));

        Personaje enemigo = new Orco("Orokhur", 100, 2, 8);

        for (Personaje p : grupo) {

            p.atacar(enemigo);

            if(p instanceof Guerrero){
                /** Hacemos downcasting */
                Guerrero g = (Guerrero)p;
                g.gritoDeGuerra();
            }
        }


    }
}
