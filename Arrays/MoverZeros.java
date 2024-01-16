package Pruebas.Arrays;

/*
Dada una matriz de números enteros nums, mueva todos 0al final manteniendo el orden relativo de los
elementos distintos de cero.
Tenga en cuenta que debe hacer esto in situ sin hacer una copia de la matriz.

Ejemplo 1:
Entrada: números = [0,1,0,3,12]
 Salida: [1,3,12,0,0]
 */
public class MoverZeros {
    public void moveZeroes(int[] nums) {
        // Inicializar el puntero para la posición de los elementos no nulos
        int nonZeroIndex = 0;

        // Mover los elementos no nulos hacia la posición adecuada
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Si el elemento no es cero, muévelo a la posición adecuada
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Llenar el resto de la matriz con ceros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Método main para ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums);

        // Imprimir el resultado
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Salida esperada: 1 3 12 0 0
    }*/
}
