package Pruebas.Arrays;

/*
Dadas dos matrices de enteros nums1 y nums2, devuelve una matriz de su intersección.
Cada elemento del resultado debe aparecer tantas veces como se muestra en ambas matrices y
puede devolver el resultado en cualquier orden.

Ejemplo 1:
Entrada: números1 = [1,2,2,1], números2 = [2,2]
Salida: [2,2]
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class InterseccionMatrices {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Crear mapas para almacenar las frecuencias de los elementos en ambos arreglos
        Map<Integer, Integer> countMap1 = new HashMap<>();
        Map<Integer, Integer> countMap2 = new HashMap<>();

        // Contar las frecuencias en el primer arreglo
        for (int num : nums1) {
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }

        // Contar las frecuencias en el segundo arreglo
        for (int num : nums2) {
            countMap2.put(num, countMap2.getOrDefault(num, 0) + 1);
        }

        // List para almacenar la intersección
        List<Integer> intersectionList = new ArrayList<>();

        // Iterar sobre las claves comunes de ambos mapas
        for (int num : countMap1.keySet()) {
            if (countMap2.containsKey(num)) {
                // Agregar el elemento repetido según la frecuencia común mínima
                int minFrequency = Math.min(countMap1.get(num), countMap2.get(num));
                for (int i = 0; i < minFrequency; i++) {
                    intersectionList.add(num);
                }
            }
        }

        // Convertir la lista de intersección a un array de int
        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }

        return intersectionArray;
    }

    // Método main para ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = sol.intersect(nums1, nums2);

        // Imprimir el resultado
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Salida esperada: 2 2
    }*/
}
