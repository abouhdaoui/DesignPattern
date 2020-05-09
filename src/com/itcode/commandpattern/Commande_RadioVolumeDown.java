package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
class Commande_RadioVolumeDown implements Icommande {

    private Radio radio;

    public Commande_RadioVolumeDown(Radio theRadio) {
        this.radio = theRadio;
    }

    @Override
    public void execute() {
        this.radio.volumeDown();
    }

    @Override
    public void undo() {
        this.radio.volumeUp();
    }

}
