package com.company;

public class Main {

    public static void main(String[] args) {
	    Person p1= new Person("Vasya","Pupkin",123);
	    Person p2= new Person("Nick","Pupkin",123);



        System.out.println("----------  == -------------------------");
	    if(p1==p2){
            System.out.println("это один Вася");
        } else {
            System.out.println("это разные Васи");
        }


        System.out.println("----------  equals -------------------------");
        if(p1.equals(p2)){
            System.out.println("это один Вася");
        } else {
            System.out.println("это разные Васи");
        }

        System.out.println("-------- String ------------");

        String str1=new String("hello");
        String str2=new String("hello");

        System.out.println("----------  == -------------------------");
        if(str1==str2){
            System.out.println("это один String");
        } else {
            System.out.println("это разные String");
        }

        System.out.println("----------  equals -------------------------");
        if(str1.equals(str2)){
            System.out.println("это один String");
        } else {
            System.out.println("это разные String");
        }

        //Person p3=null;
        ///System.out.println(str1 instanceof Person);



       /*
        String s1=null;






        p3.toString();



        DemoClass demoClass=new DemoClass(10,20);
        System.out.println(demoClass.getMax());

        demoClass.setStr1("hello");
        demoClass.setStr2("hello");
        System.out.println(demoClass.isStringEquals());

*/






	    /*

*/
    }
}
