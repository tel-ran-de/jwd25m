package com.company;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString (){
        return String.format("%s %s", firstName, lastName); // return firstName+ " " + lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastNameName(){
        return lastName;
    }
}
