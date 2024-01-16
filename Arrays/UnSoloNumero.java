package Pruebas.Arrays;

/*
Dada una matriz de números enteros no vacíanums, cada elemento aparece dos veces excepto uno. Encuentra ese único.
Debe implementar una solución con una complejidad de tiempo de ejecución lineal y utilizar
solo espacio adicional constante.
Entrada: números = [2,2,1]
Salida: 1
 */
public class UnSoloNumero {
    public int encontrarElementoUnico(int[] nums) {
        // Inicializar el resultado para almacenar el XOR de todos los elementos
        int resultado = 0;

        // Aplicar XOR a todos los elementos en el array
        for (int num : nums) {
            resultado ^= num;
        }

        return resultado;
    }

    // Método principal para el uso de ejemplo
/*    public static void main(String[] args) {
        Solucion sol = new Solucion();
        int[] nums = {2, 2, 1};
        int resultado = sol.encontrarElementoUnico(nums);
        System.out.println(resultado);  // Salida esperada: 1
    }*/
}
