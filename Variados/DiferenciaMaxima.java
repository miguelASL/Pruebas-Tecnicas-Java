package org.example;
import java.util.Arrays;

// Haz una funcion que devuelva la diferencia máxima entre dos números de una lista
public class DiferenciaMaxima {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        System.out.println(diferenciaMaxima(lista));
    }

    public static int diferenciaMaxima(int[] lista) {
        if (lista.length == 0) {
            return 0;
        }
        Arrays.sort(lista);
        int min = lista[0];
        int max = lista[lista.length - 1];
        return max - min;
    }
}
