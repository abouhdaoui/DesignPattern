package com.itcode.factory;

public class FactoryProvider {

    public static KnifeFactory getFactory(String choice) {
        if (choice == "KnifeFactory") {
            return new BudgetsKnifeFactory();
        }
        return null;
    }
}
