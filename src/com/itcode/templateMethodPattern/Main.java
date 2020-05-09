package com.itcode.templateMethodPattern;

/**
 * Created by abouhdaoui on 06/05/2020
 */
public class Main {

    public static void main (String args[]) {
        PastaDish spaggeti = new Spaggeti();
        PastaDish penne = new Penne();
        spaggeti.makeDish();
        penne.makeDish();
    }
}
