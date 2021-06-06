package com.factory;

public class Order {
    public static void main(String[] args) {
        IceCream bulkOrder = new IceCream();
        bulkOrder.setFlavor("Strawberry");
        bulkOrder.setQuantity(20);
        System.out.println("You total is $" + bulkOrder.calculateTotal());
    }
}
