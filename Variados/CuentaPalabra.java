package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Haz una funcion que cuente las palabras de un archivo de texto

public class CuentaPalabra {
    public static void main(String[] args) {
        File archivo = new File("ruta_del_archivo.txt");
        System.out.println(cuentaLineas(archivo));
    }

    public static int cuentaLineas(File archivo) {
        int contador = 0;
        try {
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNext()) {
                scanner.next();
                contador++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
        return contador;
    }
}
