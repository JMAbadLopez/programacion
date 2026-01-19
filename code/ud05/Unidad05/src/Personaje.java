public class Personaje {

    private String nombre;
    private int vida;
    private int nivel;

    private static int contadorPersonajes;

    final public static int VIDA_MAX = 500;

    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.setVida(vida);
        this.setNivel(nivel);

        this.contadorPersonajes++;
    };

    public Personaje(String nombre) {
        this(nombre,100,1);
    }

    public Personaje(Personaje p) {
        this(p.nombre,p.vida,p.nivel);
    }


    public void saludar() {
        System.out.printf( "¡Hola soy %s! Mi nivel es %d y tengo %d puntos de vida.\n", this.nombre, this.nivel, this.vida );
    }

    public void recibirDano(int puntosDano) {
        this.vida -= puntosDano;

        if(esGolpeCritico()) {
            this.vida = this.vida - 10;
            System.out.println("[GOLPE CRÍTICO] Recibe 10 ptos. extra de daño");
        }

        if (this.vida <= 0) {
            this.vida = 0;
            System.out.println("[GAME OVER] " + this.nombre + " ha muerto.");
        } else {
            System.out.println("[DAÑO] " + this.nombre + " tiene " + this.vida + " ptos. de vida");
        }
    }

    private boolean esGolpeCritico() {
        return Math.random() > 0.95;
    }

    /**
     * Getter y Setters
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {return this.nombre;}

    public void setNivel(int nivel) {
        this.nivel = nivel;
        if(this.nivel <= 0){
            this.nivel = 1;
        }
    }
    public int getNivel() {return this.nivel;}

    public void setVida(int vida) {
        this.vida = vida;
        if(this.vida < 0){
            this.vida = 0;
        }
    }
    public int getVida() {return this.vida;}

    public static int getTotalPersonajes() {return contadorPersonajes;}
}
