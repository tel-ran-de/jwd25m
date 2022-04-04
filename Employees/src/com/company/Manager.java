package com.company;

import java.util.Arrays;

public class Manager extends Employee {
    private double bonus;
     Employee[] team;
    private int capacity=2;
    private int currentIndex=0;



    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus=bonus;
    }
    @Override
    public void doWork() {
        System.out.println("I am manager " + getName() + " I get highest salary");
    }

    @Override
    public String toString() {
        return super.toString() +" Manager";
    }
    @Override
    public void getPaid(){
        double paid= super.getSalary() + bonus;
        System.out.println(String.format("I got the paid %.2f [ salary: %.2f bonus %.2f]", paid,getSalary(),bonus));
    }

    public void addToTeam(Employee e){
        if (team==null){
            team= new Employee[capacity];
            currentIndex=0;
        }
        if (currentIndex>=capacity){
            capacity*=2;
            team= Arrays.copyOf(team,capacity);

           /*
            Employee[] temp= new Employee[capacity*2];
            for (int i = 0; i < capacity; i++) {
                temp[i]=team[i];
            }
            capacity*=2;
            team = temp;
         */
        }
        team[currentIndex++]=e;

        //System.out.println(Arrays.toString(team));
    }

    public void printTeam(){
        System.out.print("Team: ");
        for (int i = 0; i <currentIndex ; i++) {
            System.out.print(team[i] + "   ");
        }
        System.out.println();
    }

    }
