package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
public class Console {

    public void on() {
        System.out.println("La console est allumée");
    }

    public void off() {
        System.out.println("La console est éteinte");
    }

    public void startGame() {
        System.out.println("Jeu lancé");
    }

    public void stopGame() {
        System.out.println("Jeu arrêté");
    }
}
