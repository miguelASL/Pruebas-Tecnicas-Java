package Pruebas.Udemy;

public class Palindromo {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}
