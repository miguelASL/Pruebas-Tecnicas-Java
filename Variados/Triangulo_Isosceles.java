package Pruebas.Variados;
/*
Diseñar un programa para trabajar con triangulos isosceles. Para ello defina los atributos necesarios que se requieren,
proporcione metodos de consultas, un metodo constructor e implemente metodos para calcular el perimetro y el area de un
triángulo, además implementar un metodo que a partir de un arreglo de triangulos devuelva el area del triangulo
de mayor superficie.
*/
public class Triangulo_Isosceles {
    private double base;
    private double lado;

    public Triangulo_Isosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double obtenerPerimetro(){
        double perimetro = 2*lado + base;
        return perimetro;
    }

    public double obtenerArea(){
        double area = (base * Math.sqrt(Math.pow(lado, 2) - Math.pow(base, 2)/4))/2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo_Isosceles{" +
                "base=" + base +
                ", lado=" + lado +
                '}';
    }
}
