package org.telran.hw_3;

import org.telran.hw_3.product.Product;

import java.util.Arrays;

public class Storage {
    private final int STORAGE_SIZE = 5;
    private Product[] products = new Product[STORAGE_SIZE];
    private int cursor = 0;

    public void addProduct(Product product) {
        if (product == null) {
            throw new NullPointerException();
        }
        if (cursor >= STORAGE_SIZE) {
            System.out.println("Storage is full");
        } else {
            products[cursor] = product;
            cursor++;
        }
    }

    public Product getProduct() {
        if (cursor == 0) {
            System.out.println("Storage is empty");
            return null;
        }
        var i = --cursor;
        Product product = products[i];
        products[i] = null;
        return product;
    }

    public void showAllProducts() {
        System.out.println(Arrays.toString(products));
    }


}
