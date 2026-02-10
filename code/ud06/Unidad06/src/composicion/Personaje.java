package composicion;

public class Personaje {

    private String nombre;
    private int vida;

    private Arma armaEquipada;
    private Mochila mochila;

    public Personaje(String nombre, Arma armaInicial) {
        this.nombre = nombre;
        // Importante: Validamos que no nos pasen un arma 'null'
        if (armaInicial == null) {
            System.out.println("¡Cuidado! Se intenta crear sin arma.");

        }
        setArmaEquipada(armaInicial);
        mochila = new Mochila(10);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    public void atacar() {
        // DELEGACIÓN: Usamos el objeto interno para trabajar
        System.out.println(this.nombre + " ataca con " + this.armaEquipada.getNombre());
        System.out.println("Daño causado: " + this.armaEquipada.getDano());
    }

    public void cambiarArma(Arma nuevaArma) {
        setArmaEquipada(nuevaArma);
        System.out.println(this.nombre + " ahora lleva: " + getArmaEquipada().getNombre());
    }

    public void setArmaEquipada(Arma nuevoArma) {
        if (nuevoArma != null) {
            this.armaEquipada = nuevoArma;
        } else {
            Arma punyoPorDefecto = new Arma("Puño", 1);
            this.armaEquipada = punyoPorDefecto;
        }
    }

    public void cogerObjeto(Item i) {
        // Delegamos en la mochila la acción de guardar
        this.mochila.guardar(i);
    }

    public void verMochila() {
        System.out.println(this.mochila.listar());
    }
}