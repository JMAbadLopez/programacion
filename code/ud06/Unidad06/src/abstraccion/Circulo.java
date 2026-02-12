package abstraccion;

public class Circulo extends Figura{

    private double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * this.radio*this.radio;
    }

}
