package com.company;

public class Person {
    public static final int ADULT=18; // constanta

    private String name;
    public static int staticVar;
    public  int nonStaticVar;
    private final int id;
    private static int currentID=0;


    public Person(String name) {
        this.name = name;
        id=++currentID;
    }

    public static void staticMethod(){
       // staticVar=this.nonStaticVar;  // error!!!
    }

    public void nonStaticMethod(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
