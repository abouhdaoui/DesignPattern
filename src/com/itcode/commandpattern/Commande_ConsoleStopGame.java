package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
class Commande_ConsoleStopGame implements Icommande {

    private Console console;

    public Commande_ConsoleStopGame(Console theConsole) {
        this.console = theConsole;
    }

    @Override
    public void execute() {
        this.console.stopGame();
    }

    @Override
    public void undo() {
        this.console.startGame();
    }

}
