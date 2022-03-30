package com.company;

public class FrontEndProgrammer extends Programmer {

    public FrontEndProgrammer(String name, double salary ){
        super(name, salary);

    }

    public String toString(){
        return super.toString();
    }

    public void doWork() {
        System.out.println("I am FrontEnd programmer" + getName() + " I make FrontEnd");
    }

}
