package Pruebas.Arrays;

/*
Se le proporciona un número entero grande representado como una matriz de números enteros digits, donde cada uno
digits[i]es el dígito del número entero. Los dígitos están ordenados del más significativo al menos significativo de
izquierda a derecha. El número entero grande no contiene ningún inicial .ith0
Incrementa el número entero grande en uno y devuelve la matriz de dígitos resultante .

Ejemplo 1:
Entrada: dígitos = [1,2,3]
 Salida: [1,2,4]
 Explicación: La matriz representa el número entero 123.
Incrementar en uno da 123 + 1 = 124.
Por tanto, el resultado debería ser [1,2,4].
 */

import java.util.ArrayList;
import java.util.List;

public class MasUno {
    public int[] plusOne(int[] digits) {
        // Inicializar el acarreo como 1 (para incrementar en uno)
        int carry = 1;

        // Lista para almacenar los nuevos dígitos
        List<Integer> result = new ArrayList<>();

        // Iterar sobre los dígitos de derecha a izquierda
        for (int i = digits.length - 1; i >= 0; i--) {
            // Sumar el dígito actual y el acarreo
            int total = digits[i] + carry;

            // Calcular el nuevo dígito y actualizar el acarreo
            result.add(0, total % 10);
            carry = total / 10;
        }

        // Si queda un acarreo al final, agregarlo como un nuevo dígito
        if (carry > 0) {
            result.add(0, carry);
        }

        // Convertir la lista de resultados a un array de int
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    // Método main para ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] digits = {1, 2, 3};
        int[] result = sol.plusOne(digits);

        // Imprimir el resultado
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Salida esperada: 1 2 4
    }*/
}
