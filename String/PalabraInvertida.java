package Pruebas.String;
/*
Escribe una función que invierta una cadena. La cadena de entrada se proporciona como una matriz de caracteres s.
Debe hacer esto modificando la matriz de entrada in situ con O(1)memoria adicional.

Ejemplo 1:
Entrada: s = ["h","e","l","l","o"]
 Salida: ["o","l","l","e","h"]
 */
public class PalabraInvertida {
    public void reverseString(char[] s) {
        new StringBuilder(String.valueOf(s)).reverse().getChars(0, s.length, s, 0);
    }

    // Método main para ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] inputString = {'h', 'e', 'l', 'l', 'o'};
        sol.reverseString(inputString);

        // Imprimir el resultado
        for (char c : inputString) {
            System.out.print(c + " ");
        }
        // Salida esperada: o l l e h
    }*/
}
