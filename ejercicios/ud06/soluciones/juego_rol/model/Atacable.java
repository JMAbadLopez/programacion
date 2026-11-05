package model;

public interface Atacable {
    void recibirDano(int cantidad);

    String getNombre();

    boolean estaVivo();
}
