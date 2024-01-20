package Pruebas.String;

import java.util.Arrays;

/*
Escriba una función para encontrar la cadena de prefijo común más larga entre una matriz de cadenas.
Si no hay un prefijo común, devuelve una cadena vacía "".

Ejemplo 1:
Entrada: strs = ["flor","flujo","vuelo"]
Salida: "fl
 */
public class PrefijoComúnMásLargo {
    public String longestCommonPrefix(String[] strs) {
        // Si no hay cadenas en la lista, devuelve una cadena vacía
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Ordena la lista de cadenas
        Arrays.sort(strs);

        // La cadena más corta en la lista es el primer elemento
        // La cadena más larga en la lista es el último elemento
        // Estos dos elementos son los que más difieren
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Encuentra el prefijo común más largo entre la primera y la última cadena
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                prefix.append(first.charAt(i));
            } else {
                break;
            }
        }

        // Devuelve el prefijo común más largo
        return prefix.toString();
/*    public static void main(String[] args) {
        // Crear una instancia de la clase Solution
        Solution sol = new Solution();

        // Ejemplo 1: ["flower","flow","flight"]
        // El prefijo común más largo es "fl"
        System.out.println(sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // Debería imprimir "fl"

        // Ejemplo 2: ["dog","racecar","car"]
        // No hay un prefijo común, por lo que se devuelve una cadena vacía
        System.out.println(sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"})); // Debería imprimir ""

        // Ejemplo 3: ["interspecies","interstellar","interstate"]
        // El prefijo común más largo es "inters"
        System.out.println(sol.longestCommonPrefix(new String[]{"interspecies", "interstellar", "interstate"})); // Debería imprimir "inters"
    }*/
    }
}
