package polimorfismo;

public abstract class Personaje implements Atacable, Comparable<Personaje> {

    protected String nombre;
    protected int vida;
    protected int nivel;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
    }

    public abstract void atacar(Personaje objetivo);

    @Override
    public void recibirDano(int cantidad) {
        this.vida -= cantidad;
        if (this.vida < 0) this.vida = 0;
        System.out.println(this.nombre + " recibe " + cantidad + " de daño. Vida restante: " + this.vida);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNombre() { return nombre; }

    // --- MÉTODOS DE IGUALDAD Y ORDEN ---

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personaje other = (Personaje) obj;
        return this.nombre.equals(other.nombre);
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }

    @Override
    public int compareTo(Personaje o) {
        // Orden alfabético por nombre
        return this.nombre.compareTo(o.nombre);
    }
}
