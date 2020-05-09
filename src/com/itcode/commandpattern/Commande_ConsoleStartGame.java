package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
class Commande_ConsoleStartGame implements Icommande {

    private Console console;

    public Commande_ConsoleStartGame(Console theConsole) {
        this.console = theConsole;
    }

    @Override
    public void execute() {
        this.console.startGame();
    }

    @Override
    public void undo() {
        this.console.stopGame();
    }

}
