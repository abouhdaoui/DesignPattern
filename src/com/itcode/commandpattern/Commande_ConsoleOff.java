package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
class Commande_ConsoleOff implements Icommande {

    private Console console;

    public Commande_ConsoleOff(Console theConsole) {
        this.console = theConsole;
    }

    @Override
    public void execute() {
        this.console.off();
    }

    @Override
    public void undo() {
        this.console.on();
    }
}
