package com.shop;

import java.util.ArrayList;

public class IceCream {

    private ArrayList<String> flavors = new ArrayList<>();
    private String coneOrCup;
    private ArrayList<String> toppings = new ArrayList<>();
    private double price;

    public IceCream() {

    }

    public IceCream(ArrayList<String> flavors, String coneOrCup, ArrayList<String> toppings, double price) {
        this.flavors = flavors;
        this.coneOrCup = coneOrCup;
        this.toppings = toppings;
        this.price = price;
    }

    public void selectConeOrCup(String coneOrCup) {
        this.coneOrCup = coneOrCup;
        if (coneOrCup.equals("cone")) {
            price += 1.00;
        } else price += .50;
    }

    public void addScoop(String flavor) {
        this.flavors.add(flavor);
        price += 2.00;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
        price += .25;
    }
    
    public double checkOut() {
        return price;
    }

    public ArrayList<String> getFlavors() {
        return flavors;
    }

    public void setFlavors(ArrayList<String> flavors) {
        this.flavors = flavors;
    }

    public String getConeOrCup() {
        return coneOrCup;
    }

    public void setConeOrCup(String coneOrCup) {
        this.coneOrCup = coneOrCup;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}