package ru.test;

public class App7 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 2};
        System.out.println(sr(arr));
    }

    private static double sr(int arr[]){
        double x = 0;
        double y = 0;
        for(int i = 0; i < arr.length; i++){
            x += arr[i];
        }
        y = x / arr.length;
        return y;
    }
}
