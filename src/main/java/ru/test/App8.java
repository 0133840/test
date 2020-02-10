package ru.test;

public class App8 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 7, -2};
        System.out.println(min(arr));
    }

    private static int min(int arr[]){
        int x = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(x > arr[i]){
                x = arr[i];
            }
        }
        return x;
    }
}
