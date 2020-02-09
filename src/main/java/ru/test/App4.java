package ru.test;

import java.util.Arrays;

public class App4 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 4, -2, 7};
        System.out.println(Arrays.toString(arr));
        m(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void m(int[] arr){
        for (int a = 0; a < arr.length; a++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                }
            }
        }

    }
}
