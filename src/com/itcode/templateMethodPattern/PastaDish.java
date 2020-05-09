package com.itcode.templateMethodPattern;

/**
 * Created by abouhdaoui on 06/05/2020
 */
public abstract class PastaDish {

    // this method represent template with 4 abstract methods specific of each subclass
    void makeDish() {
        boilWater();
        cookPasta();
        drainAndPlate();

        addPasta();
        addSauce();
        addProtein();
        addGarnish();
    }

    private void drainAndPlate() {
        System.out.println("drain and plate");
    }

    private void cookPasta() {
        System.out.println("cook pasta");
    }

    private void boilWater() {
        System.out.println("boil water");
    }

    abstract void addPasta();
    abstract void addSauce();
    abstract void addProtein();
    abstract void addGarnish();

}
