package com.itcode.factory;

public class FactoryProvider {

    public static KnifeFactory getFactory(String choice) {
        if (choice == "KnifeFactory") {
            new BudgetsKnifeFactory();
        }

    }
}
