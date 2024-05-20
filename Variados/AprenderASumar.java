package org.example;
import java.util.Scanner;

// Haz un programa para aprender a sunmar en poco tiempo
public class AprenderASumar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a aprender a sumar!");

        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma + ".");

        scanner.close();
    }
}
