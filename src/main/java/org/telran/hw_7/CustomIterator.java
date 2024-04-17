package org.telran.hw_7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIterator implements Iterator {


    private int[] integers;
    private int index = 0;

    public CustomIterator(int[] integers) {
        this.integers = integers;
    }

    @Override
    public boolean hasNext() {
        return index < integers.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return integers[index++];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        CustomIterator iterator = new CustomIterator(numbers);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}