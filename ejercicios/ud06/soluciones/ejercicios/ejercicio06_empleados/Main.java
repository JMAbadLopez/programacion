package ejercicio06_empleados;

public class Main {
    public static void main(String[] args) {
        Asalariado a = new Asalariado("Juan", "García", "12345678A", 21000);
        Comisionado c = new Comisionado("Ana", "López", "87654321B", 1000, 0.1);
        PorHoras p = new PorHoras("Luis", "Pérez", "11223344C", 15);

        c.registrarVenta(5000);
        p.setHorasTrabajadas(160);

        Empleado[] empleados = { a, c, p };

        for (Empleado e : empleados) {
            System.out.println(e + " - Salario: " + String.format("%.2f", e.calcularSalarioMensual()) + "€");
        }
    }
}
