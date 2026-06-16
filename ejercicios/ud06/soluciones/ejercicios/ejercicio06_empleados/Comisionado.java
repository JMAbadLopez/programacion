package ejercicio06_empleados;

public class Comisionado extends Empleado {
    private double sueldoBase;
    private double ventasRealizadas;
    private double porcentajeComision;

    public Comisionado(String nombre, String apellidos, String dni, double sueldoBase, double porcentajeComision) {
        super(nombre, apellidos, dni);
        this.sueldoBase = sueldoBase;
        this.porcentajeComision = porcentajeComision;
        this.ventasRealizadas = 0;
    }

    public void registrarVenta(double importe) {
        this.ventasRealizadas += importe;
    }

    @Override
    public double calcularSalarioMensual() {
        return sueldoBase + (ventasRealizadas * porcentajeComision);
    }
}
