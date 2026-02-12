package model;

public class Item {
    private String nombre;
    private int attackBonus;
    private int defenseBonus;

    public Item(String nombre, int attackBonus, int defenseBonus) {
        this.nombre = nombre;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    @Override
    public String toString() {
        return nombre + " [Ataque: " + attackBonus + ", Defensa: " + defenseBonus + "]";
    }
}
