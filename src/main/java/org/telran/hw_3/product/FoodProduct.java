package org.telran.hw_3.product;

public class FoodProduct extends Product {
    public FoodProduct() {
        super("FoodProduct");
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
