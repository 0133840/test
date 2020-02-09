package ru.test;

public class App3 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    private static int fact(int a) {
        int result = 1;
        for (int i = 2; i<=a; i++) {
            result *= i;
        }
        return result;
    }
}
