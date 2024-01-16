package Pruebas.Arrays;

/*
Dada una matriz de enteros numsordenada en orden no decreciente , elimine los duplicados en el lugar de
modo que cada elemento único aparezca solo una vez . El orden relativo de los elementos debe mantenerse igual.
Luego devuelve el número de elementos únicos ennums .
Considere la cantidad de elementos únicos de numsto be k. Para ser aceptado, debe hacer lo siguiente:

Cambie la matriz numsde modo que los primeros kelementos numscontengan los elementos únicos en el orden en que estaban
presentes numsinicialmente. Los elementos restantes de numsno son importantes al igual que el tamaño de nums.
Devolver k.

Entrada: nums = [1,1,2]
Salida: 2, nums = [1,2,_]
Explicación: Su función debería devolver k = 2, siendo los dos primeros elementos de nums 1 y 2 respectivamente.
No importa lo que dejes más allá de la k devuelta (de ahí que sean guiones bajos).
 */

public class EliminarDuplicados {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Inicializa el índice para los elementos únicos
        int indiceUnico = 0;

        // Itera a través del arreglo empezando desde el segundo elemento
        for (int i = 1; i < nums.length; i++) {
            // Verifica si el elemento actual es diferente al anterior
            if (nums[i] != nums[indiceUnico]) {
                // Incrementa el índice único
                indiceUnico++;
                // Mueve el elemento único a su posición correcta
                nums[indiceUnico] = nums[i];
            }
        }

        // La cantidad de elementos únicos es (indiceUnico + 1)
        return indiceUnico + 1;
    }

    // Método main para ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] expectedNums = {1, 2, 3, 4, 5};

        int k = sol.removeDuplicates(nums);

        // Verifica si el arreglo modificado coincide con la respuesta esperada
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }*/
}
