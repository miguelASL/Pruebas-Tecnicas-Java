package Pruebas.String;
/*
Dada una cadena s, busque el primer carácter no repetido que contenga y devuelva su índice . Si no existe, regresa -1.

Entrada: s = "aabb"
Salida: -1
 */
public class ValorUnico {
    public int firstUniqChar(String s) {
// Recorremos la cadena 's' utilizando índices
        for (int i = 0; i < s.length(); i++) {
            // Verificamos si el carácter actual 's.charAt(i)' aparece solo una vez en la cadena
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                // Si es así, devolvemos el índice actual como la primera posición única
                return i;
            }
        }
        // Si no se encuentra ningún carácter único, devolvemos -1
        return -1;
    }

/*    public static void main(String[] args) {
        // Crear una instancia de la clase Solution
        Solution sol = new Solution();

        // Ejemplo de prueba
        // Probamos la función con una cadena de ejemplo
        String inputStr = "leetcode";
        int result = sol.firstUniqChar(inputStr);

        // Imprimimos el resultado
        System.out.println("La primera posición única en '" + inputStr + "' es: " + result);
    }*/
}

