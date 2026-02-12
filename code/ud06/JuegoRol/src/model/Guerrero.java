package model;

public class Guerrero extends Humano {
    public Guerrero(String nombre, int vida, int attackPoints, int defensePoints) {
        super(nombre, vida, attackPoints, defensePoints);
        // El sysout de creación lo hace el padre (Humano) o podemos añadir uno propio
        // System.out.println("He creado un " + this.getClass().getSimpleName());
    }

    @Override
    public void defender(int danoRecibido) {
        int danoReal = danoRecibido - getDefensePoints();
        if (danoReal < 5) {
            danoReal = 0;
            System.out.println(this.nombre + " (Guerrero) ignora el daño por su piel dura.");
        }

        // Llamamos a super.defender() con el daño ajustado?
        // No, porque super.defender() vuelve a calcular defensa.
        // Copiamos la lógica básica de restar vida:

        if (danoReal > 0) {
            this.vida -= danoReal;
            if (this.vida < 0)
                this.vida = 0;
            System.out.println(this.nombre + " recibe " + danoReal + " de daño. Vida restante: " + this.vida);
        }
    }
}
