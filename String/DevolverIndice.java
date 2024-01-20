package Pruebas.String;
/*
Dadas dos cadenas needley haystack, devuelve el índice de la primera aparición de needleen haystack, o -1 si needleno
forma parte de haystack.

Ejemplo 1:
Entrada: haystack = "sadbutsad", needley = "sad"
Salida: 0
Explicación: "sad" ocurre en los índices 0 y 6.
La primera aparición está en el índice 0, por lo que devolvemos 0.
 */
public class DevolverIndice {
    public int strStr(String haystack, String needle) {
        // Si needle es una cadena vacía, devuelve 0
        if (needle.isEmpty()) {
            return 0;
        }

        // Devuelve el índice de la primera aparición de la needle en el haystack
        // Si needle no está en el haystack, devuelve -1
        return haystack.indexOf(needle);
    }
}

    // Ejemplo de uso
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.strStr("sadbutsad", "sad"));  // Debería imprimir 0
        System.out.println(sol.strStr("hello", "ll"));  // Debería imprimir 2
        System.out.println(sol.strStr("aaaaa", "bba"));  // Debería imprimir -1
        System.out.println(sol.strStr("", ""));  // Debería imprimir 0
}*/

