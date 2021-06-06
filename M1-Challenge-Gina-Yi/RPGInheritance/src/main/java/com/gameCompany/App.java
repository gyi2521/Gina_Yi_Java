package com.gameCompany;

public class App {
    public static void main(String[] args) {

        Farmer gina = new Farmer("Gina, the farmer");
        Constable mary = new Constable("Mary, the constable");
        Warrior jack = new Warrior("Jack, the warrior");

        System.out.println(gina);
        gina.plow(2);
        gina.harvest();
        gina.run();
        System.out.println("****************************");

        System.out.println(mary);
        mary.setJurisdiction("Suwanee");
        mary.arrest(jack);
        mary.attack();
        mary.decreaseHealth(20);
        System.out.println(mary);
        System.out.println("****************************");

        System.out.println(jack);
        jack.increaseStamina(30);
        jack.decreaseStamina(50);
        jack.heal(80);
        jack.setShieldStrength(150);
        jack.decreaseShieldStrength(30);
        System.out.println(jack.getShieldStrength());
        System.out.println(jack);

    }
}
