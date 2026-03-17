package org.example;

import java.util.ArrayList;

public class MyProductManager {
    //private String[] products;
    private ArrayList products;
    //private int index;
    public MyProductManager()
    {
        //this.products = new String[5];
        this.products = new ArrayList();
        //this.index = 0;
    }

    public void addProduct(String productName)
    {
//        products[index] = productName;
//        index++;
        products.add(productName);
        products.add(4);
        products.add(true);
        products.add(4.5);

    }

    public void printProducts()
    {
        if(products.isEmpty())
        {
            System.out.println("No products to print. the list is empty");
            return;
        }
//        for (int i = 0; i < products.length; i++) {
//            if(products[i] != null)
//             System.out.print(products[i]+" ");
//        }
//        for (int i = 0; i < products.size(); i++) {
//            System.out.print(products.get(i)+" ");
//        }

        //foreach loop
        for(Object p : products)
        {
            System.out.print( p+" ");
        }
        System.out.println();
    }
    public void printProductsInReverserOrder()
    {


        if(products.isEmpty())
        {
            System.out.println("No products to print. the list is empty");
            return;
        }
//        products.get(0); // first element
//        products.get(products.size()-1); // last element
        for (int i = products.size()-1; i >=0 ; i--) {
            System.out.print(products.get(i)+" ");
        }
        System.out.println();
    }

    public void deleteProduct(String productName)
    {
        boolean isRemoved = products.remove(productName);
    }
    public void deleteProduct(int index)
    {

        products.remove(index);
    }

    public int getProductSize()
    {
        //return this.products.length;
        return this.products.size();
    }

}
