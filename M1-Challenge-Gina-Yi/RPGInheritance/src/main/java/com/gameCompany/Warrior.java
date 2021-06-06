package com.gameCompany;

import java.util.Objects;

public class Warrior extends Person{

    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower);
        this.shieldStrength = shieldStrength;
    }

    public Warrior(String warriorName) {
        name = warriorName;
        strength  = 75;
        health = 100;
        stamina = 100;
        speed = 50;
        attackPower = 10;
        shieldStrength = 100;
    }

    public Warrior() {

    }

    public void decreaseShieldStrength(int decreaseByThisMuch) {
        shieldStrength -= decreaseByThisMuch;
        System.out.println("Now your new Shield Strength is " + shieldStrength + ".");
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                '}';

    }
}
