package ejercicio06_empleados;

public abstract class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String dni;

    public Empleado(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public abstract double calcularSalarioMensual();

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (DNI: " + dni + ")";
    }
}
