package Pruebas.String;
/*
Implemente la myAtoi(string s)función, que convierte una cadena en un entero con signo de 32 bits (similar a la
atoifunción de C/C++).
El algoritmo para myAtoi(string s)es el siguiente:
Lea e ignore cualquier espacio en blanco inicial.
Compruebe si el siguiente carácter (si no está al final de la cadena) es '-'o '+'. Lea este personaje si lo es.
Esto determina si el resultado final es negativo o positivo respectivamente. Suponga que el resultado es positivo si
ninguno de los dos está presente.
Lea a continuación los caracteres hasta llegar al siguiente carácter que no sea un dígito o al final de la entrada.
El resto de la cadena se ignora.
Convierta estos dígitos en un número entero (es decir "123" -> 123, "0032" -> 32). Si no se leyeron dígitos, entonces
el número entero es 0. Cambie el letrero según sea necesario (desde el paso 2).
Si el número entero está fuera del rango de enteros con signo de 32 bits , entonces fije el número entero para que
permanezca en el rango. Específicamente, los números enteros menores que se deben fijar a , y los enteros mayores que
se deben fijar a .[-231, 231 - 1]-231-231231 - 1231 - 1
Devuelve el número entero como resultado final.
Nota:

Sólo el carácter de espacio ' 'se considera un carácter de espacio en blanco.
No ignore ningún carácter que no sea el espacio en blanco inicial o el resto de la cadena después de los dígitos.

Ejemplo 1:

Entrada: s = "42"
Salida: 42
Explicación: Los caracteres subrayados son lo que se lee, el cursor es la posición actual del lector.
Paso 1: "42" (no se leen caracteres porque no hay espacios en blanco al principio)
         ^
Paso 2: "42" (no se leen caracteres porque no hay '-' ni '+')
         ^
Paso 3: " 42 " (" Se lee 42")
           ^
El número entero analizado es 42.
Dado que 42 está en el rango [-2 31 , 2 31 - 1], el resultado final es 42.
 */
public class CadenaAEntero {
    public int myAtoi(String s) {
        // Eliminamos los espacios en blanco al principio y al final de la cadena
        s = s.trim();

        // Verificamos si la cadena está vacía
        if (s.isEmpty()) {
            return 0;
        }

        // Inicializamos el signo como positivo
        int sign = 1;

        // Verificamos el primer carácter para determinar el signo
        if (s.charAt(0) == '-') {
            sign = -1;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        // Inicializamos el resultado como 0
        int res = 0;

        // Iteramos sobre los caracteres de la cadena
        for (char c : s.toCharArray()) {
            // Verificamos si el carácter es un dígito
            if (Character.isDigit(c)) {
                // Actualizamos el resultado multiplicándolo por 10 y sumándole el dígito convertido a entero
                res = res * 10 + Character.getNumericValue(c);
            } else {
                // Si encontramos un carácter no numérico, terminamos el bucle
                break;
            }
        }

        // Aplicamos el signo al resultado
        res = sign * res;

        // Manejamos los límites de overflow
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return res;
        }
    }

/*    public static void main(String[] args) {
        // Crear una instancia de la clase Solution
        Solution sol = new Solution();

        // Ejemplo de prueba
        // Probamos la función con una cadena de ejemplo
        String inputStr = "   -42";
        int result = sol.myAtoi(inputStr);

        // Imprimimos el resultado
        System.out.println("La conversión de '" + inputStr + "' a entero es: " + result);
    }*/
}
