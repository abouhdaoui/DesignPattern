package com.itcode.adapter;

public class Client {

    private CoffeeMachineInterface coffeeMachine;

    public Client(CoffeeMachineInterface coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void doCoffe() {
        coffeeMachine.chooseFirstSelection();
        coffeeMachine.chooseSecondSelection();
    }

}
