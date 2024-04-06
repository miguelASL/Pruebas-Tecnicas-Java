package Pruebas.Variados;

import javax.swing.*;
import java.util.Scanner;

public class main {

    // Método para devolver el indice del coche más barato de un array de objetos Vehiculos
    public static int indiceCocheMBarato(Vehiculos coches[]) {
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();

        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        // Creamos el objeto de la clase Vehiculos
        Vehiculos coches[] = new Vehiculos[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del vehiculo " + (i + 1) + ":");
            System.out.print("Marca: ");
            marca = entrada.nextLine();
            System.out.print("Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculos(marca, modelo, precio);
        }
        // Buscamos el coche más barato y mostramos sus datos por pantalla
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl vehiculo más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
