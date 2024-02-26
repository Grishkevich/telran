package org.telran.hw_3.product;

public class TechProduct extends Product {
    public TechProduct() {
        super("TechProduct");
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
