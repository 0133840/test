package ru.test;

public class App5 {
    public static void main(String[] args) {
        System.out.println(prog(2,3,2));
    }
    private static int prog(int x, int d, int y) {
        int k = 0;
        for(int i = x; i<=(x+(y*d)); i = i + d){
         k += i;
        }
        return k;
    }
}
