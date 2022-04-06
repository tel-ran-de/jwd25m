package com.company;

public final class BackEndProgrammer extends Programmer {

    public BackEndProgrammer(String name, double salary) {
        super(name, salary);
    }

    public void doWork() {
        System.out.println("I am BackEnd programmer" + getName() + " I make super system!");
    }


}
