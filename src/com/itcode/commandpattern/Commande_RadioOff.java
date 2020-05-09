package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
class Commande_RadioOff implements Icommande {

    private Radio radio;

    public Commande_RadioOff(Radio theRadio) {
        this.radio = theRadio;
    }

    @Override
    public void execute() {
        this.radio.off();
    }

    @Override
    public void undo() {
        this.radio.on();
    }

}
