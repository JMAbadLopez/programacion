public class Termostato {

    private double temperatura;
    private boolean estaEncendido;

    public Termostato() {
        this.temperatura = 20.0;
        this.estaEncendido = false;
    }

    public void encender() { this.estaEncendido = true; }
    public void apagar() { this.estaEncendido = false; }

    public void subirTemperatura(double temperatura) {
        if(this.estaEncendido) {
            this.temperatura += temperatura;
        }
    }

    public void bajarTemperatura(double temperatura) {
        if(this.estaEncendido) {
            this.temperatura -= temperatura;
        }
    }

    public String toString() {
        return "Encendido: " + this.estaEncendido + ", Temperatura: " + this.temperatura;
    }
}
