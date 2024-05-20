package org.example;
import java.util.Scanner;
import java.util.Random;

// Simula erl juego de cara o cruz

public class CaraOCruz {
    public static void main(String[] args) {
        String[] opciones = {"cara", "cruz"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige cara o cruz: ");
        String usuario = scanner.nextLine().toLowerCase();

        boolean opcionValida = false;
        for (String opcion : opciones) {
            if (opcion.equals(usuario)) {
                opcionValida = true;
                break;
            }
        }

        if (!opcionValida) {
            System.out.println("Opción no válida");
            System.exit(0);
        } else {
            Random rand = new Random();
            String maquina = opciones[rand.nextInt(opciones.length)];
            System.out.println("La máquina ha elegido " + maquina);

            if (usuario.equals(maquina)) {
                System.out.println("Has ganado!");
            } else {
                System.out.println("Has perdido");
            }
        }

        scanner.close();
    }
}
