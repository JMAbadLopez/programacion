package ejercicio06_empleados;

public class PorHoras extends Empleado {
    private double precioHora;
    private int horasTrabajadas;

    public PorHoras(String nombre, String apellidos, String dni, double precioHora) {
        super(nombre, apellidos, dni);
        this.precioHora = precioHora;
        this.horasTrabajadas = 0;
    }

    public void setHorasTrabajadas(int horas) {
        this.horasTrabajadas = horas;
    }

    @Override
    public double calcularSalarioMensual() {
        return precioHora * horasTrabajadas;
    }
}
