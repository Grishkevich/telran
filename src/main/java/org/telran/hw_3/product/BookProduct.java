package org.telran.hw_3.product;

public class BookProduct extends Product {
    public BookProduct() {
        super("BookProduct");
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
