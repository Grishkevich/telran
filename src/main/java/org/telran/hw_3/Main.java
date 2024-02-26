package org.telran.hw_3;

import org.telran.hw_3.product.BookProduct;
import org.telran.hw_3.product.FoodProduct;
import org.telran.hw_3.product.TechProduct;
import org.telran.hw_3.truck.BigTruck;
import org.telran.hw_3.truck.MediumTruck;
import org.telran.hw_3.truck.SmallTruck;
import org.telran.hw_3.truck.Truck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var loadingWarehouse = new Storage();
        var unloadingWarehouse = new Storage();

        var sc = new Scanner(System.in);
//      Tech,Food,Book,Book,Food
        System.out.println("Enter product names (Tech,Food,Book) max 5:");
        var productsName = sc.next();
        addProductsToWarehouse(productsName, loadingWarehouse);
        System.out.print("products on loadingWarehouse: ");
        loadingWarehouse.showAllProducts();
        System.out.print("products on unloadingWarehouse: ");
        unloadingWarehouse.showAllProducts();
        System.out.println("Create truck type (Big or Medium or Small):");
        var selectTruck = sc.next();
        var truck = getTruck(selectTruck);

        for (var i = 0; i < truck.getTruckSize(); i++) {
            truck.addProduct(loadingWarehouse.getProduct());
        }

        System.out.println("moving products to the unloadingWarehouse");

        for (var i = 0; i < truck.getTruckSize(); i++) {
            unloadingWarehouse.addProduct(truck.unloadProduct());
        }

        System.out.print("products on loadingWarehouse: ");
        loadingWarehouse.showAllProducts();
        System.out.print("products on unloadingWarehouse: ");
        unloadingWarehouse.showAllProducts();
    }

    public static void addProductsToWarehouse(String products, Storage storage) {
        for (String product: products.split(",")) {
            if (product.equals("Tech")) {
                storage.addProduct(new TechProduct());
            } else if (product.equals("Book")) {
                storage.addProduct(new BookProduct());
            } else if (product.equals("Food")) {
                storage.addProduct(new FoodProduct());
            } else {
                System.out.println("unknow");
            }
        }
    }

    public static Truck getTruck(String type) {
        if (type.equals("Big")) {
            return new BigTruck();
        } else if (type.equals("Medium")) {
            return new MediumTruck();
        } else {
            return new SmallTruck();
        }
    }
}
