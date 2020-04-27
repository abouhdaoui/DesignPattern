package com.itcode.factory;

// Abstract factory
public abstract class KnifeFactory {

    // si on a plusieurs client, on peut créer des subclasse de la factory adapté à chaque client
    abstract Knife getKnife (String knifeType);


}
