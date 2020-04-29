package com.itcode.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine oldVendingMachine;

    public void connectToOldCoffeMachine(OldCoffeeMachine oldCoffeeMachine) {
        this.oldVendingMachine = oldCoffeeMachine;
        // maybe some code to connect to OldMachine
    }

    @Override
    public void chooseFirstSelection() {
        oldVendingMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldVendingMachine.selectB();
    }
}
