package ru.test;

public class App6 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2};
        System.out.println(summ(arr));
    }

    private static int summ(int arr[]){
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            x = x + arr[i];
        }
        return x;
    }
}
