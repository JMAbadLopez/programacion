package model;

public interface ICombatiente {
    void atacar(ICombatiente oponente);

    void defender(int danoRecibido);

    String getNombre();

    int getVida();
}
