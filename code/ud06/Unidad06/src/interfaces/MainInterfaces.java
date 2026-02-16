package interfaces;

public class MainInterfaces {

    public static void main(String[] args) {

        Coordenadas localizacion = new Coordenadas(39.67, -0.25);

        Perro perro = new Perro("Sparky", localizacion);
        Usuario usuario = new Usuario("Dulcinea del Toboso", 18, localizacion);

        System.out.println("Mi perro está en " + perro.getLatitud() + " " +  perro.getLongitud());
        System.out.println("Dulcinea del Toboso está en  " + usuario.getLatitud() + " " +  usuario.getLongitud());

    }
}
