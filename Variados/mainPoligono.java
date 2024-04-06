package Pruebas.Variados;

import java.util.ArrayList;
import java.util.Scanner;

public class mainPoligono {
    static ArrayList<Poligonos> poligonos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Llenar los polígonos
        llenarPoligonos();

        // Mostrar los resultados
        mostrarResultados();
    }
    public static void llenarPoligonos() {
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite el número de lados del polígono");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                System.out.println("Opcion:");
                opcion = scanner.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1: // llenar un triángulo
                    llenarTriangulo();
                    break;
                case 2: // llenar un rectángulo
                    llenarRectangulo();
                    break;
            }

            System.out.println("Desea agregar otro polígono? (s/n)");
            respuesta = scanner.next().charAt(0);
            System.out.println();
        } while (respuesta == 's' || respuesta == 'S');
    }
    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.println("Digite el lado 1 del triángulo");
        lado1 = scanner.nextDouble();
        System.out.println("Digite el lado 2 del triángulo");
        lado2 = scanner.nextDouble();
        System.out.println("Digite el lado 3 del triángulo");
        lado3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(3, lado1, lado2, lado3);
        // Guardar el triángulo en la lista de polígonos
        poligonos.add(new Triangulo(3, lado1, lado2, lado3));
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.println("Digite el lado 1 del rectángulo");
        lado1 = scanner.nextDouble();
        System.out.println("Digite el lado 2 del rectángulo");
        lado2 = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(4, lado1, lado2);
        // Guardar el rectángulo en la lista de polígonos
        poligonos.add(new Rectangulo(4, lado1, lado2));
    }

    public static void mostrarResultados() {
        for (Poligonos poligono : poligonos) {
            System.out.println(poligono.toString());
            System.out.println("Área: " + poligono.area());
            System.out.println();
        }
    }
}