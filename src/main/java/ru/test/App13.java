package ru.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class App13 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/test.txt"))) {
            int temp;
            ByteBuffer byteBuffer = ByteBuffer.allocate(100);
            while ((temp = fileInputStream.read()) != -1) {
                byteBuffer.put((byte) temp);
            }
            System.out.println(new String(byteBuffer.array(), StandardCharsets.UTF_8));

            catchEx();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        catchEx();
        uncatchEx();
    }

    public static void throwEx() {
        throw new IllegalStateException("test");
    }

    public static void catchEx() throws IOException {

    }

    public static void uncatchEx() throws RuntimeException {

    }
}
