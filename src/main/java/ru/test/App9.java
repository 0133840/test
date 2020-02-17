package ru.test;

import java.util.*;
import java.util.function.Supplier;

public class App9 {
    public static void main(String[] args) {
        testList(new ArrayList<>(), Integer.MAX_VALUE / 2000);
        testList(new LinkedList<>(), Integer.MAX_VALUE / 2000);
    }

    private static void testList(List<Integer> list, int size) {
        timedExecution(() -> {
            fillListWithRandom(list, size);
            return null;
        }, "creation", list);

        int middleElementPosition = size / 2;
        Integer middleElement = timedExecution(() -> list.get(middleElementPosition), "get", list);

        Integer index = timedExecution(() -> list.indexOf(middleElement),
                "index", list);

        timedExecution(() -> {
            list.contains(middleElement);
            return null;
        }, "contains", list);

        timedExecution(() -> {
            list.remove(middleElement);

            return null;
        }, "[remove by object]", list);

        timedExecution(() -> {
            list.remove(middleElementPosition);

            return null;
        }, "[remove by index]", list);

        timedExecution(() -> {
            ListIterator<Integer> iter =
                    list.listIterator();
            for (int i = 0; i<5000; i++) {
                iter.next();
                iter.remove();
            }

            return null;
        }, "[mass remove]", list);
    }

    private static Integer timedExecution(Supplier<Integer> timedSupplier, String operationType, List<Integer> list) {
        long start = System.currentTimeMillis();
        Integer result = timedSupplier.get();
        long finish = System.currentTimeMillis();
        System.out.println("[" + list.getClass().getSimpleName() + "] " + operationType + " cpu time: " + (finish - start));
        return result;
    }

    private static void fillListWithRandom(List<Integer> list, int size) {
        Random random = new Random();
        for (int i = 0; i<size; i++) {
            list.add(random.nextInt());
        }
    }
}
