package org.telran.hw_6;

import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //        task 1
        List<Integer> task1List = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> task1listNew = task1List.stream().map(integer -> integer * 2).toList();
        System.out.println(task1listNew); // -> [2, 4, 6, 8, 10, 12, 14, 16, 18]
        //        task 2
        List<String> task2List = List.of("Test", "Hello", "World", "I am from Ukraine", "Hello Kitty");
        List<Integer> task2ListNew = task2List.stream().map(String::length).toList();
        System.out.println(task2ListNew); // -> [4, 5, 5, 17, 11]
        //        task 3
        List<Integer> task3List = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> task3listNew = task3List.stream().filter(integer -> integer % 2 != 0).toList();
        System.out.println(task3listNew); // -> [1, 3, 5, 7, 9]
        //        task 4
        List<String> task4List = List.of("one", "two", "one", "three", "two", "three", "one");
        List<String> task4ListNew = new HashSet<>(task4List).stream().toList();
        System.out.println(task4ListNew); // -> [one, two, three]
    }
}
