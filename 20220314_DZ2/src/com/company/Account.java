package com.company;

public class  Account {
    private String IBAN;
    private Person client;
    private double balance;

    public Account(String IBAN, Person client, double balance) {
        this.IBAN = IBAN;
        this.client = client;
        this.balance = balance;
    }

    public String toString() {
        return String.format("Client: %s; IBAN: %s; Balance %.2f", client.toString(), IBAN, balance);
    }

    public String getIBAN() {
        return IBAN;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public String secureToString(){
        StringBuilder newIBAN = new StringBuilder(IBAN);
        for (int i = 4; i < IBAN.length() - 2; i++) {
            newIBAN.setCharAt(i, '*');
        }
        return String.format("Client: %s; IBAN: %s; Balance %.2f; ", client, newIBAN, balance);
    }

}
