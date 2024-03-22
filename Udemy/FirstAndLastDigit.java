package Pruebas.Udemy;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) {
            return -1; // Invalid value
        }
        int lastDigit = number % 10;
        // number = 0 -> lastDigit = 0
        while (number >= 10) {
            number /= 10;
        }
        return number + lastDigit;
    }
}
