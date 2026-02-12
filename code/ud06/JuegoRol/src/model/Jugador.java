package model;

import java.util.ArrayList;
import java.util.Objects;
import exceptions.JuegoRolException;

public abstract class Jugador implements ICombatiente {
    protected String nombre;
    protected int vida;
    protected int attackPoints;
    protected int defensePoints;
    protected ArrayList<Item> inventario;
    protected ArrayList<Equipo> equipos;

    public Jugador(String nombre, int vida, int attackPoints, int defensePoints) {
        this.nombre = nombre;
        this.vida = vida;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.inventario = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getVida() {
        return vida;
    }

    public int getAttackPoints() {
        int totalAttack = this.attackPoints;
        for (Item i : inventario) {
            totalAttack += i.getAttackBonus();
        }
        return totalAttack;
    }

    public int getDefensePoints() {
        int totalDefense = this.defensePoints;
        for (Item i : inventario) {
            totalDefense += i.getDefenseBonus();
        }
        return totalDefense;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void addItem(Item i) {
        this.inventario.add(i);
        System.out.println(this.nombre + " ha equipado: " + i.getNombre());
    }

    public void removeItem(Item i) {
        this.inventario.remove(i);
    }

    public void addEquipo(Equipo e) throws JuegoRolException {
        if (equipos.contains(e)) {
            throw new JuegoRolException("El jugador ya pertenece al equipo " + e.getNombre());
        }
        equipos.add(e);
        if (!e.getJugadores().contains(this)) {
            e.addJugador(this);
        }
    }

    public void removeEquipo(Equipo e) throws JuegoRolException {
        if (!equipos.contains(e)) {
            throw new JuegoRolException("El jugador no pertenece al equipo " + e.getNombre());
        }
        equipos.remove(e);
        if (e.getJugadores().contains(this)) {
            e.removeJugador(this);
        }
    }

    @Override
    public void atacar(ICombatiente oponente) {
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " con " + getAttackPoints() + " puntos.");
        oponente.defender(this.getAttackPoints());
    }

    @Override
    public void defender(int danoRecibido) {
        int danoReal = danoRecibido - getDefensePoints();
        if (danoReal < 0)
            danoReal = 0;

        this.vida -= danoReal;
        if (this.vida < 0)
            this.vida = 0;

        System.out.println(this.nombre + " recibe " + danoReal + " de daño. Vida restante: " + this.vida);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre)
                .append(" | PA: ").append(getAttackPoints())
                .append(" | PD: ").append(getDefensePoints())
                .append(" | Vida: ").append(vida)
                .append(" (Equipos: ").append(equipos.size()).append(")");

        if (!inventario.isEmpty()) {
            sb.append("\n\tItems: ");
            for (Item i : inventario) {
                sb.append(i.getNombre()).append(" ");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
