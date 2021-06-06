package com.shop;

public class Order {
    public static void main(String[] args) {

        IceCream makeOrder = new IceCream();
        makeOrder.selectConeOrCup("cone");
        makeOrder.addScoop("vanilla");
        makeOrder.addScoop("strawberry");
        makeOrder.addTopping("whip cream");
        makeOrder.addTopping("chocolate");

        System.out.println("You chose a " + makeOrder.getConeOrCup() + ".");
        System.out.println("You chose " + makeOrder.getFlavors() + " flavors.");
        System.out.println("You added " + makeOrder.getToppings() + " toppings.");
        System.out.println("Your total is $" + makeOrder.checkOut());

    }
}
