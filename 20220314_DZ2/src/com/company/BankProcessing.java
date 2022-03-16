package com.company;

import java.util.Arrays;

public class BankProcessing {
    Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public String toString() {
        String str=Arrays.toString(bankAccounts);
        return Arrays.toString(bankAccounts);
    }

    public Person[] banksClients() {
        Person[] banksClient = new Person[bankAccounts.length];
        for (int i = 0; i < bankAccounts.length; i++) {
             banksClient[i] = bankAccounts[i].getClient();
        }
        return banksClient;
    }

    public String secureToString(){
        String newBanksAccounts = "";
        for (int i = 0; i < bankAccounts.length; i++) {
            newBanksAccounts += bankAccounts[i].secureToString();
        }
        return newBanksAccounts;
    }

    public double sumOfAllBalance(){
        double sum = 0.00;
        for (int i = 0; i < bankAccounts.length; i++) {
            sum += bankAccounts[i].getBalance();
        }
        return sum;
    }
}
