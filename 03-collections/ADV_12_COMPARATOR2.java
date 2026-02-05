// WAP to show the use of Comparator in java - 2.
// Author : Nikhil

import java.util.*;

class Product {
    String name;
    double price;

    Product(String n, double p) {
        this.name = n;
        this.price = p;
    }
}

public class ADV_12_COMPARATOR2 {
    public static void main(String[] args) {
        ArrayList<Product> items = new ArrayList<>();

        items.add(new Product("Laptop", 50000));
        items.add(new Product("Mouse", 500));
        items.add(new Product("Phone", 30000));

        Collections.sort(items, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.price - o2.price);
            }
        });

        for(Product p : items) {
            System.out.println(p.name + " : " + p.price);
        }
    }
}
