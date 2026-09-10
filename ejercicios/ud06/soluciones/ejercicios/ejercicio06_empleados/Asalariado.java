package ejercicio06_empleados;

public class Asalariado extends Empleado {
    private double sueldoAnual;

    public Asalariado(String nombre, String apellidos, String dni, double sueldoAnual) {
        super(nombre, apellidos, dni);
        this.sueldoAnual = sueldoAnual;
    }

    @Override
    public double calcularSalarioMensual() {
        return sueldoAnual / 14;
    }
}
