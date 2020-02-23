package ru.test;

public class App10 {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(5000);
                    System.out.println("im still alive, time: " + System.currentTimeMillis());
                }
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }).start();
    }
}
