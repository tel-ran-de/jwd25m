package com.company;

public class Intern extends Employee{
    public String note;

    public Intern(String name, double salary) {
        super(name, salary);
    }

    public void qwe(){
        System.out.println("qwe!!!!");
    }

    @Override
    public String toString() {
        return "Intern{" +
                "note='" + note + '\'' +
                '}';
    }

    @Override
    public void doWork() {
        System.out.println("default work");
    }
}
