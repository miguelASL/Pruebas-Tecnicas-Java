package Pruebas.String;

/*
Dado un entero de 32 bits con signo x, regresa xcon sus dígitos invertidos. Si la inversión xhace que el valor salga
del rango de enteros de 32 bits con signo, entonces devuelva.[-231, 231 - 1]0
Suponga que el entorno no le permite almacenar enteros de 64 bits (con o sin signo)
*/

public class EnteroInveso {
    public int reverse(int x) {
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        // Manejar el signo del número
        int sign = (x >= 0) ? 1 : -1;
        x *= sign;

        // Invertir los dígitos
        int reversedX = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Verificar desbordamiento antes de multiplicar por 10
            if (reversedX > (INT_MAX - digit) / 10) {
                return 0;
            }

            reversedX = reversedX * 10 + digit;
        }

        return reversedX * sign;
    }
}