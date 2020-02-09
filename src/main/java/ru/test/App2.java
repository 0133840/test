package ru.test;

public class App2 {
    public static void main(String[] args) {
        System.out.println(pow(2, -5));
    }

    private static double pow(int a, int b) {
        double result = 1;
        for (int i = 0; i<Math.abs(b); i++) {
            if (b>0) {
                result *= a;
            } else {
                result /= a;
            }
        }
        return result;
    }
}
