package org.example;
import java.util.Scanner;

// Haz una funcion que pida una frase y cuente cuantas palabras tiene
public class PalabrasEnFrase {
    public static void main(String[] args) {
        System.out.println(contar());
    }

    public static int contar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = scanner.nextLine();
        String[] palabras = frase.split(" ");
        return palabras.length;
    }
}
