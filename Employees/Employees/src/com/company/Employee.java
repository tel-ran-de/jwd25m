package com.company;

public abstract class Employee {
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
}

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee %s [%.2f]",name,salary);
    }

    public void getPaid(){

        System.out.println("I got the paid " + salary);
    }

    public  abstract void doWork();

}
