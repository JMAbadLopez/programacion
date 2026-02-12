package model;

public class Enemigo extends Jugador {
    public Enemigo(String nombre, int vida, int attackPoints, int defensePoints) {
        super(nombre, vida, attackPoints, defensePoints);
        System.out.println("He creado un " + this.getClass().getSimpleName());
    }

    @Override
    public void atacar(ICombatiente oponente) {
        int ataqueFinal = getAttackPoints();

        if (this.vida > 20) {
            ataqueFinal += 3;
            System.out.println(this.nombre + " entra en FURIA (+3 ataque, -3 defensa temporal).");
            // Nota: La defensa no se modifica permanentemente en el enunciado original
            // durante el ataque,
            // pero si quisiéramos reflejarlo deberíamos tocar defensePoints.
            // Para simplificar según enunciado "disminuyen en 3 sus puntos de defensa",
            // asumimos que es temporal para este turno si le atacaran,
            // pero como atacar() es instantáneo, solo aplicamos el ataque extra.
        }

        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " con " + ataqueFinal + " puntos.");
        oponente.defender(ataqueFinal);
    }

    @Override
    public void defender(int danoRecibido) {
        int defensaFinal = getDefensePoints();
        if (this.vida > 20) {
            defensaFinal -= 3;
        }

        int danoReal = danoRecibido - defensaFinal;
        if (danoReal < 0)
            danoReal = 0;

        this.vida -= danoReal;
        if (this.vida < 0)
            this.vida = 0;

        System.out.println(this.nombre + " recibe " + danoReal + " de daño. Vida restante: " + this.vida);
    }
}
