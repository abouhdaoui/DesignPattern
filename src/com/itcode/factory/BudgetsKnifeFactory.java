package com.itcode.factory;

// concrete factory
public class BudgetsKnifeFactory extends KnifeFactory {


    @Override
    public Knife getKnife(String knifeType) {
        if (knifeType == "chefs") {
            return new BugetsChefsKnife();
        } else if (knifeType == "steak") {
            return new BugetsSteakKnife();
        }
        return null;
    }
}
