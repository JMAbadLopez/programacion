package abstraccion;

public class MainGeometria {

    public static void main(String[] args) {

        Cuadrado cuadradro = new Cuadrado("Rojo", 10,12);
        Circulo circulo = new Circulo("Azul", 3);
        Triangulo triangulo = new Triangulo("Amarillo", 5, 2);


        /**
         * No podemos instanciar un objeto abstracto
         * Figura figura = new Figura("Verde");
         */

        System.out.println("El área del cuadrado es " + cuadradro.calcularArea());
        System.out.println("El área del circulo es " + circulo.calcularArea());
        System.out.println("El área del triangulo es " + triangulo.calcularArea());

        System.out.println("Constante de Gravedad : " + ConstantesFisicas.GRAVEDAD);

    }
}
