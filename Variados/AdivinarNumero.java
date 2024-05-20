package org.example;
import java.util.Scanner;
import java.util.Random;

// Simula el juego de adivinar un número

public class AdivinarNumero {
    public static void main(String[] args) {
        Random rand = new Random();
        int ordenador = rand.nextInt(100) + 1;
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introduce un número: ");
            int usuario = scanner.nextInt();
            intentos++;

            if (usuario < ordenador) {
                System.out.println("El número es mayor");
            } else if (usuario > ordenador) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Has acertado!");
                System.out.println("Has necesitado " + intentos + " intentos");
                break;
            }
        }
        scanner.close();
    }
}
