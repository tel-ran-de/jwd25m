package com.company;

public class Person {
    String firstName;
    String lastName;
    MyDate birthday;

    public Person(String firstName,String lastName,MyDate birthday){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthday=birthday;
    }

    public String toString(){
        return this.firstName+" "+this.lastName+" [" + this.birthday.toString()+"]";
    }


}
