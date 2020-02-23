package ru.test;

public class App12 {
    public final static String World = "hello";

    public final static void main(final String[] args) {
        System.out.println("hello");
    }

    private static class Hello extends App12 {

    }

    interface A {
        void aa();
    }

    interface B extends A {
        void aaa();
    }

    interface C extends A, B {
        void ccc();
    }
}
