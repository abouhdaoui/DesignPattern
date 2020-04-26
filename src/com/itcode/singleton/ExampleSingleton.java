package com.itcode.singleton;

public class ExampleSingleton {
    /**
     * - singleton doit être accessible de partout
     * - il ne doit être instancier qu'au premier appel et non au
     * chargement du programme (souci de perf)
     * - il doit être instancier que après avoir vérifier qu'il
     * n'existe aucune instance dèjà créer pour pas l'ecraser
     *
     * => Singleton ne signifie pas seulement création d'un unique
     * instance à tout instance, mais egalement gardé la 1ere instance
     * créer et non l'ecraser par une nouvelle
      */

    // private : ne peut être modifier que d'ici
    private static ExampleSingleton uniqueInstance = null;

    // si public : on risque d'ecraser si instance existe déjà
    private ExampleSingleton() {
    }

    // static parce que tt méthode qui manipule une variable
    // static, doit être static
    public static ExampleSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }

    // instantiate thread-safe singleton with synchronized word
    public static synchronized  ExampleSingleton ThreadSafeSingleton() {
        if (uniqueInstance == null) {
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }

}
