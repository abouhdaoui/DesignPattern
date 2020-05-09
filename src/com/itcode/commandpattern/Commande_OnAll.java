package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
class Commande_OnAll implements Icommande {

    private Console console;
    private Radio radio;

    public Commande_OnAll(Console theConsole, Radio theRadio) {
        this.console = theConsole;
        this.radio = theRadio;
    }

    @Override
    public void execute() {
        this.console.on();
        this.radio.on();
    }

    @Override
    public void undo() {
        this.console.off();
        this.radio.off();
    }

}
