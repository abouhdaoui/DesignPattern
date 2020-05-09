package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
public class Radio {

    private int volume = 0;

    public void on() {
        System.out.println("La radio est allumée");
    }

    public void off() {
        System.out.println("La radio est éteinte");
    }

    public void volumeUp() {
        this.volume++;
        System.out.println("Le volume est de : " + this.volume);
    }

    public void volumeDown() {
        this.volume--;
        System.out.println("Le volume est de : " + this.volume);
    }
}
