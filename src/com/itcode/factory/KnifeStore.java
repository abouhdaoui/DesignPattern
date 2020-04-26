package com.itcode.factory;

public class KnifeStore {

    // KnifeStore devient le client de KnifeFactory
    // Stores don't care how knifes are made, even if factory
    // change the way they operate to produce knife
    private KnifeFactory knifeFactory;

    public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }

    public Knife orderKnife (String knifeType) {
        Knife knife;
        knife = knifeFactory.createKnife(knifeType);

        return knife;
    }
}
