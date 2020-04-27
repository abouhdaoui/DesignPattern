package com.itcode.factory;

public class Client {

    // KnifeStore devient le client de KnifeFactory
    // Stores don't care how knifes are made, even if factory
    // change the way they operate to produce knife

    // It appear in generalization (ref : coding to an interface not implementation)
    // on peut rajouter de nouveau type de couteau juste par heritage de Knife sans toucher au code client

    // le client s'enfout de comment l'objet est fabriqué tant qu'il le recoit
    // il ne doit pas intervenir parce que la factory peut avoir plusieurs clients

    public static void main (String args[]) {
        KnifeFactory kf = FactoryProvider.getFactory("KnifeFactory");
        Knife f = kf.getKnife("steak");
    }

}
