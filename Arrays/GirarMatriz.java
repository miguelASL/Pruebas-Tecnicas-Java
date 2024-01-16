package Pruebas.Arrays;

/*
Dada una matriz de números enteros nums, gire la matriz hacia la derecha en kpasos, donde kno es negativo.

Ejemplo 1:
Entrada: números = [1,2,3,4,5,6,7], k = 3
 Salida: [5,6,7,1,2,3,4]
 Explicación:
rotar 1 paso a la derecha: [7,1,2,3,4,5,6]
rotar 2 pasos a la derecha: [6,7,1,2,3,4,5]
rotar 3 pasos a la derecha: [5,6,7,1,2,3,4]
 */

public class GirarMatriz {
    public void rotate(int[] nums, int k) {
        // Si k es mayor que la longitud de la matriz, toma el módulo
        k = k % nums.length;

        // Crea un arreglo auxiliar para almacenar los elementos girados
        int[] rotated = new int[nums.length];

        // Copia los últimos k elementos al principio del arreglo auxiliar
        System.arraycopy(nums, nums.length - k, rotated, 0, k);

        // Copia los primeros (n - k) elementos al resto del arreglo auxiliar
        System.arraycopy(nums, 0, rotated, k, nums.length - k);

        // Copia los elementos girados de vuelta a la matriz original
        System.arraycopy(rotated, 0, nums, 0, nums.length);
    }

    // Método main para ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        sol.rotate(numbers, k);

        // Imprime la matriz resultante
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        // Salida esperada: 5 6 7 1 2 3 4
    }*/
}
