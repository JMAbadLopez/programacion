package herencia;

public class Personaje {
    protected String nombre;
    protected int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void saludar() {
        System.out.println("Hola, soy un personaje genérico.");
    }
}