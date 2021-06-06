package com.gameCompany;

import java.util.Objects;

public class Person {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;

    public Person(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public Person() {

    }

    public void run() {
        System.out.println("I can run!");
    }
    public void attack() {
        System.out.println("I can attack you!");
    }
    public void heal(int health) {
        this.health +=  health;
        System.out.println("I am healed! " + this.health);
    }
    public void decreaseHealth(int decreaseHealthBy) {
        this.health -=  decreaseHealthBy;
        System.out.println("I need help... " + this.health);
    }
    public void increaseStamina(int increaseStaminaBy) {
        this.stamina += increaseStaminaBy;
        System.out.println("I have more stamina now..." + this.stamina );
    }
    public void decreaseStamina(int decreaseBy) {
        this.stamina -= decreaseBy;
        System.out.println("I have little stamina now..." + this.stamina);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return strength == person.strength && health == person.health && stamina == person.stamina && speed == person.speed && attackPower == person.attackPower && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
