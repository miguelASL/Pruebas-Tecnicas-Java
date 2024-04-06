package Pruebas.Variados;
/*
Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados.
Los valores de la longitud deberán introducirse por línea de comandos y serán números enteros. Si es un cuadrado,
solo se proporcionará la longitud de uno de los lados al constructor.
*/
public class cuadrilatero{
    private double lado1;
    private double lado2;

    public cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public cuadrilatero(double lado1) {
        // this.lado1 = this.lado2 = lado1;
        this.lado1 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public double getPerimetro(){
        double perimetro = 2*lado1 + 2*lado2;
        return perimetro;
    }

    public double getArea(){
        double area = lado1*lado2;
        return area;
    }
}
