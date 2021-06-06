package com.gameCompany;

public class Farmer extends Person {

    public Farmer() {
    }

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, strength, health, stamina, speed, attackPower);
    }

    public Farmer(String farmerName) {
        name = farmerName;
        strength = 75;
        health = 100;
        stamina = 75;
        speed = 10;
        attackPower = 1;
    }

    public void plow(int acres) {
        System.out.println(name + " plows " + acres + " acres.");
    }
    public void harvest() {
        System.out.println(name + " finished harvesting!");
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
