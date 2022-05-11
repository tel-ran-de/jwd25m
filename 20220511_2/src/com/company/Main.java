package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1= new Person("p1");
        Person p2= new Person("p2");
        Person.staticVar = 10;



        System.out.println("1:  "+p1);
        Person.staticVar =30;
        p1.staticVar =20+p1.nonStaticVar;
        System.out.println(p2);
        System.out.println("2:  "+p1);
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(new Person("p3"));
        System.out.println(list);


        Manager manager=Manager.getInstance("Jack");
        System.out.println("1: "+manager);

        Manager manager1=Manager.getInstance("Nick");
        System.out.println("2: "+manager1);
        System.out.println(manager==manager1);




    }






}
