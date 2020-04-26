package com.itcode.factory;

public class KnifeFactory {
    public Knife createKnife (String knifeType) {
        Knife knife = null;

        if (knifeType.equals("steak")) {
            knife = null;
        } else if (knifeType.equals("chefs")) {
            knife = null;
        }
        return knife;
    }

    // we can add easily new subclass to create new type of objects (like fork)


}
