package com.company;

public class Main {

    public static void main(String[] args) {
	    Observer1 observer1=new Observer1();
	    Observer2 observer2=new Observer2();

	    ObservedClass observedClass=new ObservedClass();

	    observedClass.add(observer1);
	    observedClass.add(observer2);

	    observedClass.setStr("Hello");


    }
}
