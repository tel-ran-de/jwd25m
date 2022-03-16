package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*Implement a simple bank app
	a. Create Person class with the following attributes (String firstName, String lastName).
	Write constructor, toString and getters methods.
	b. Create Account class with the following attributes String IBAN, Person client, double balance.
	Write constructor, toString and getters methods.
	c. Create BankProcessing class with an attribute Account[] bankAccounts.
	Write a constructor, which takes an array of Accounts as argument.
	Write toString method. Write the method witch return the array of all of the bank clients.
	d. In the Account class write secureToString method which works like normal toString
	but instead IBAN put in the result string something like DE45 *********35
	(replaces all characters of IBAN string to char ‘’ except four first and two last characters).
	e. In the BankProcessing implement the secureToString method which displays the accounts using Account. secureToString method.
	f. In the BankProcessing implement the method which returns the sum of all accounts balances.*/

        Person vasia = new Person("Vasia", "Ivanov");
        System.out.println(vasia);
        Person masha = new Person("Masha", "Sidorova");
        System.out.println(masha);
        Person olga = new Person("Olga", "Rodigina");
        System.out.println(olga);
        System.out.println();

        Account accVasia = new Account("DE45 657728387335", vasia, 100.542);
        System.out.println(accVasia);
        Account accMasha = new Account("DE45 899922277335", masha, 99674);
        System.out.println(accMasha);
        Account accOlga = new Account("DE45 655599927335", olga, 100000);
        System.out.println(accOlga);
        System.out.println();

        Account[] accounts = {accVasia, accMasha, accOlga};
        BankProcessing clients = new BankProcessing(accounts);
        System.out.println(clients);
        System.out.println();

        System.out.println(Arrays.toString(clients.banksClients()));
        System.out.println();

        System.out.println(clients.secureToString());
        System.out.println(String.format("The sum of all accounts balances: %.2f", clients.sumOfAllBalance()));
    }
}
