package com.factory;

public class IceCream {
    private String flavor;
    private int quantity;
    private double pricePerFiveGallon;

    public IceCream() {

    }

    public IceCream(String flavor, int quantity, double pricePerFiveGallon) {
        this.flavor = flavor;
        this.quantity = quantity;
        this.pricePerFiveGallon = pricePerFiveGallon;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
        if(flavor.equals("Vanilla")) {
            setPricePerFiveGallon(20.00);
        }else {
            setPricePerFiveGallon(25.00);
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return quantity * pricePerFiveGallon;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerFiveGallon() {
        return pricePerFiveGallon;
    }

    private void setPricePerFiveGallon(double pricePerFiveGallon) {
        this.pricePerFiveGallon = pricePerFiveGallon;
    }
}


