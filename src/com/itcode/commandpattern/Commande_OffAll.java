package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
class Commande_OffAll implements Icommande {

    private Console console;
    private Radio radio;

    public Commande_OffAll(Console theConsole, Radio theRadio) {
        this.console = theConsole;
        this.radio = theRadio;
    }

    @Override
    public void execute() {
        this.console.off();
        this.radio.off();
    }

    @Override
    public void undo() {
        this.console.on();
        this.radio.on();
    }

}
