package org.telran.hw_8;

import java.util.*;

public class TaskOne {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        var rand = new Random();
        for (var i = 0; i < 100; i++) {
            integerList.add(rand.nextInt(10));
        }

        Set<Integer> s1 = new HashSet<>(integerList);
        Set<Integer> s2 = new LinkedHashSet<>(integerList);

        System.out.println(s1); // отсортированный набор уникальных элементов
        System.out.println("-------------------------------");
        System.out.println(s2); // набор только уникальных элементов

        try {
            Thread.sleep(111);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
