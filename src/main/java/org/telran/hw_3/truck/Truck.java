package org.telran.hw_3.truck;

import org.telran.hw_3.product.Product;

public abstract class Truck {
    private final int TRUCK_SIZE;

    private int cursor = 0;

    private Product[] products;

    public Truck(int truckSize) {
        TRUCK_SIZE = truckSize;
        products = new Product[TRUCK_SIZE];
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new NullPointerException();
        }
        if (cursor >= TRUCK_SIZE) {
            System.out.println("Truck is full");
        } else {
            products[cursor] = product;
            cursor++;
        }
    }

    public Product unloadProduct() {
        if (cursor == 0) {
            System.out.println("Truck is empty");
            return null;
        }
        var i = --cursor;
        Product product = products[i];
        products[i] = null;
        return product;
    }

    public int getTruckSize() {
        return TRUCK_SIZE;
    }

}
