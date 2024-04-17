package org.telran.hw_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            integerList.add(i);
        }

//        for-each loop
        long start = System.currentTimeMillis();
        for (int i : integerList) {
            int temp = i;
        }
        long end = System.currentTimeMillis();

        System.out.println("for-each loop: " + (end - start));
// classic for и вызываем list.size() для каждой итерации
        start = System.currentTimeMillis();
        for (int i = 0; i <= integerList.size(); i++) {
            int temp = i;
        }
        end = System.currentTimeMillis();
        System.out.println("classic for и вызываем list.size() для каждой итерации: " + (end - start));

// classic for, но list.size() определяем в переменную
        start = System.currentTimeMillis();
        for (int i = 0; i <= integerList.size(); i++) {
            int temp = integerList.size();
        }
        end = System.currentTimeMillis();
        System.out.println("classic for, но list.size() определяем в переменную: " + (end - start));


// classic for, list.size() определяем в переменную, перебираем с конца (i--)
        start = System.currentTimeMillis();
        for (int i = integerList.size(); i >= 0; i--) {
            int temp = integerList.size();
        }
        end = System.currentTimeMillis();
        System.out.println("classic for, list.size() определяем в переменную, перебираем с конца (i--): " + (end - start));

// используя Itertor
        start = System.currentTimeMillis();
        Iterator<Integer> listIterator = integerList.iterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println("используя Itertor: " + (end - start));

// используя ListIterator
        start = System.currentTimeMillis();
        ListIterator<Integer> integerListIterator = integerList.listIterator();
        while (integerListIterator.hasNext()) {
            int temp = integerListIterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println("используя ListIterator: " + (end - start));

    }
}
