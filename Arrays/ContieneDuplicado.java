package Pruebas.Arrays;

/*
Dada una matriz de números enteros nums, devuelve truesi algún valor aparece al menos dos veces en la matriz y devuelve
falsesi cada elemento es distinto.

Ejemplo 1:
Entrada: números = [1,2,3,1]
Salida: verdadero
 */

import java.util.HashSet;
import java.util.Set;
public class ContieneDuplicado {
    public boolean containsDuplicate(int[] nums) {
        // Creamos un conjunto (Set) para almacenar los elementos únicos que hemos encontrado
        Set<Integer> seen = new HashSet<>();

        // Iteramos sobre el arreglo de números
        for (int num : nums) {
            // Verificamos si el elemento ya está en el conjunto (ya ha sido encontrado antes)
            if (seen.contains(num)) {
                // Si encontramos un duplicado, devolvemos true
                return true;
            }

            // Agregamos el elemento al conjunto (ya que es la primera vez que lo encontramos)
            seen.add(num);
        }

        // Si llegamos hasta aquí, no hemos encontrado duplicados, devolvemos false
        return false;
    }

    // Método main para ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 1};
        boolean result = sol.containsDuplicate(nums);

        // Imprimimos el resultado
        System.out.println(result);  // Salida esperada: true
    }*/
}
