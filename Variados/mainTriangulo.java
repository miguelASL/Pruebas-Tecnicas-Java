package Pruebas.Variados;

import java.util.Scanner;

public class mainTriangulo {

    public static double MayorAreA(Triangulo_Isosceles triangulos[]){
        double area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
           if(triangulos[i].obtenerArea() > area){
                area= triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.println("Digite el número de triángulos a calcular: ");nTriangulos = sc.nextInt();

        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos];

        for (int i = 0; i < nTriangulos; i++) {

            System.out.println("\nDigite los valores del triángulo " + (i+1) + ": ");
            System.out.println("Digite la base del triángulo " + (i+1) + ": ");
            base = sc.nextDouble();
            System.out.println("Digite el lado del triángulo " + (i+1) + ": ");
            lado = sc.nextDouble();

            triangulos[i] = new Triangulo_Isosceles(base, lado);

            System.out.println("\nEl perimetro del triángulo " + (i+1) + " es: " + triangulos[i].obtenerPerimetro());
            System.out.println("El área del triángulo " + (i+1) + " es: " + triangulos[i].obtenerArea());
        }
        System.out.println("\nEl área del triángulo con mayor área es: " + MayorAreA(triangulos));
    }
}
