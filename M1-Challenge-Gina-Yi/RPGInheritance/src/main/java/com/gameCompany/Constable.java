package com.gameCompany;

import java.util.Objects;

public class Constable extends Person {
    private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower);
        this.jurisdiction = jurisdiction;
    }
    public Constable(String constableName) {
        name = constableName;
        strength = 60;
        health = 100;
        stamina = 60;
        speed = 20;
        attackPower = 5;
        jurisdiction = "";
    }

    public Constable() {

    }

    public void arrest(Person arrestedPerson) {
        System.out.println(name + " arrested " + arrestedPerson.name + "." );
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +

                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", jurisdiction=" + jurisdiction +
                '}';
    }
}
