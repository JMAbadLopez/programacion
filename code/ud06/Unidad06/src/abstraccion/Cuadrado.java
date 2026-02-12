package abstraccion;

public class Cuadrado extends Figura{

    private double base, altura;

    public Cuadrado(String color, double base, double altura){
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
         return this.base*this.altura;
    }
}
