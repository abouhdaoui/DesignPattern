package com.itcode.templateMethodPattern;

/**
 * Created by abouhdaoui on 06/05/2020
 */
public class Penne extends PastaDish {
    @Override
    void addPasta() {
        System.out.println("add penne");
    }

    @Override
    void addSauce() {
        System.out.println("add sauce penne");
    }

    @Override
    void addProtein() {
        System.out.println("add shrimp");
    }

    @Override
    void addGarnish() {
        System.out.println("add cheese");
    }
}
