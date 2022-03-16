package com.company;

public class Main {

    public static void main(String[] args) {
	  MyDate date1 = new MyDate(12,3,1999);
	  Person p1 = new Person("Ivan","Ivanov",date1);
	  Person p2= new Person("Nick","Nickov",
              new MyDate(11,4,1999));



        System.out.println(date1);
        System.out.println(p1);

        p2.birthday.print();

    }
}
