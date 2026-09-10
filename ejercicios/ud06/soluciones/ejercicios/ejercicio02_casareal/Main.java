package ejercicio02_casareal;

public class Main {
    public static void main(String[] args) {
        Casa miCasa = new Casa();

        miCasa.agregarHabitacion(new Habitacion("Salón", 25.5));
        miCasa.agregarHabitacion(new Habitacion("Cocina", 12.0));
        miCasa.agregarHabitacion(new Habitacion("Dormitorio", 15.0));

        System.out.println(miCasa);

        System.out.println("\nBorrando Cocina...");
        miCasa.borrarHabitacion("Cocina");
        System.out.println(miCasa);
    }
}
