package Pruebas.Variados;

public class Rectangulo extends Poligonos{

    private double lado1;
    private double lado2;

    public Rectangulo(int numeroLados, double lado1, double lado2) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }
    @Override
    public String toString() {
        return super.toString() +
                "lado1= " + lado1 +
                ", lado2= " + lado2 +
                '}';
    }



}
