package Pruebas.String;


/*
Dadas dos cadenas sy t, devuelve true si t es un anagrama de s, y false en caso contrario .
Un anagrama es una palabra o frase formada reorganizando las letras de una palabra o frase diferente, normalmente usando todas las letras originales exactamente una vez.

Ejemplo 1:
Entrada: s = "anagrama", t = "nagaram"
Salida: verdadero
*/
import java.util.Arrays;

public class Anagrama {
    public boolean isAnagram(String s, String t) {
        // Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Compare the sorted character arrays
        return Arrays.equals(sChars, tChars);
    }

    // Main method for example usage
/*    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "anagram";
        String t = "nagaram";
        boolean result = sol.isAnagram(s, t);
        System.out.println(result);  // Expected output: true
    }*/
}
