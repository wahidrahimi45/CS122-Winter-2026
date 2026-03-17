package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyProductManager productManager = new MyProductManager();

        productManager.addProduct("Laptop");
        productManager.addProduct("Mouse");
        productManager.addProduct("Keyboard");
        productManager.addProduct("Monitor");
        productManager.addProduct("Desk");
        productManager.addProduct("Pen");

        productManager.printProducts();
        productManager.printProductsInReverserOrder();
        System.out.println("Product size: "+productManager.getProductSize());

//        productManager.deleteProduct(0);
//        productManager.deleteProduct("Desk");
//        productManager.printProducts();
//
//        System.out.println("Product size: "+productManager.getProductSize());

    }
}