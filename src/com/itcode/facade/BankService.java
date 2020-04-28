package com.itcode.facade;

import java.math.BigDecimal;
import java.util.Hashtable;

/*
    The BankService class is the façade. Its public methods are simple to use and show aucune
    trace de l'interface and implementing classes. The information hiding principle is used
    here to prevent client classes from “seeing” the account objects, and how these
    accounts behave – note that access modifies for each Account have been set to private.
     */

public class BankService {

    private Hashtable<Integer, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<>();
    }

    // cette méthode cache au client la structure des type de compte et leurs methodes
    // cela est camouflé par String type et initAmount
    public int createNewAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;
        switch (type) {
            case "chequing" -> newAccount = new Chequing(initAmount);
            case "saving" -> newAccount = new Saving(initAmount);
            case "investment" -> newAccount = new Investment(initAmount);
            default -> System.out.println("Invalid account type");
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }
    public void transferMoney(int to, int from, BigDecimal amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }

}
