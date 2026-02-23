package ejercicio05_figuras;

public class Rectangulo extends Figura2D {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectángulo [Base: " + base + ", Altura: " + altura + "]";
    }
}
