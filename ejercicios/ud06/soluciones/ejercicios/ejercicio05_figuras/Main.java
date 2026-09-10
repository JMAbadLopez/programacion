package ejercicio05_figuras;

public class Main {
    public static void main(String[] args) {
        Figura2D c = new Circulo(5.0);
        Figura2D r = new Rectangulo(4.0, 6.0);

        System.out.println(c + " | Area: " + String.format("%.2f", c.calcularArea()) + " | Perimetro: "
                + String.format("%.2f", c.calcularPerimetro()));
        System.out.println(r + " | Area: " + r.calcularArea() + " | Perimetro: " + r.calcularPerimetro());

        // Figura2D f = new Figura2D(); // Error de compilación: Figura2D es abstracta
    }
}
