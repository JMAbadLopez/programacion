package file;

class Personaje {

    private String nombre;
    private int nivel;
    private double puntosVida;

    public Personaje(String nombre, int nivel, double puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(double puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        return "Héroe: " + this.nombre + " | Nivel: " + this.nivel + " | Puntos vida: " + this.puntosVida;
    }
}
