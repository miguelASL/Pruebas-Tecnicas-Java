package org.example;

public class SumaRecusiva {
    public static void main(String[] args) {
        System.out.println(sumarRecursiva(5));
    }

    public static int sumarRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumarRecursiva(n - 1);
        }
    }
}
