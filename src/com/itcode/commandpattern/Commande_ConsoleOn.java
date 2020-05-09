package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
public class Commande_ConsoleOn implements Icommande {

    private Console console;

    public Commande_ConsoleOn(Console theConsole) {
        this.console = theConsole;
    }

    @Override
    public void execute() {
        this.console.on();
    }

    @Override
    public void undo() {
        this.console.off();
    }

}
