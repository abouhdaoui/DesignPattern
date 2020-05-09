package com.itcode.commandpattern;

/**
 * Created by abouhdaoui on 09/05/2020
 */
public class Main {

    public static void main(String[] args) {
        // Creation télécommande Radio
        Radio radio = new Radio();
        Telecommande telecommandeRadio =
                new Telecommande(new Commande_RadioOn(radio), new Commande_RadioOff(radio),
                new Commande_RadioVolumeUp(radio), new Commande_RadioVolumeDown(radio));

        //Test télécommande radio
        telecommandeRadio.pressBtn1(); //On allume la radio
        telecommandeRadio.pressBtn3(); //VolumeUp
        telecommandeRadio.pressBtn3(); //VolumeUp
        telecommandeRadio.pressBtn4(); //VolumeDown
        telecommandeRadio.pressBtn2(); //On éteint la radio

        System.out.println("");


        //Creation télécommande Console
        Console console = new Console();
        Telecommande telecommandeConsole = new Telecommande(new Commande_ConsoleOn(console), new Commande_ConsoleOff(console),
                new Commande_ConsoleStartGame(console), new Commande_ConsoleStopGame(console));

        //Test télécommande console
        telecommandeConsole.pressBtn1(); //On allume la console
        telecommandeConsole.pressBtn3(); //StartGame
        telecommandeConsole.pressBtn4(); //StopGame
        telecommandeConsole.pressBtn2(); //on éteint la console

        System.out.println("");

        //Et si on faisait une télécommande pour gérer l'état de chaque device...
        Telecommande telecommandeMultiple = new Telecommande(new Commande_OnAll(console, radio), new Commande_OffAll(console, radio));

        telecommandeMultiple.pressBtn1();
        telecommandeMultiple.pressBtn2();
    }
}
