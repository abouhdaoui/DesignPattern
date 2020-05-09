package com.itcode.templateMethodPattern;

/**
 * Created by abouhdaoui on 06/05/2020
 */
public class Spaggeti extends PastaDish {

    @Override
    void addPasta() {
        System.out.println("add spaggeti");
    }

    @Override
    void addSauce() {
        System.out.println("add sauce spaggeti");
    }

    @Override
    void addProtein() {
        System.out.println("add meatball");
    }

    @Override
    void addGarnish() {
        System.out.println("add cheese");
    }
}
