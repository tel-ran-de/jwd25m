package com.company;

public class Manager extends Employee {
    private double bonus;
    EmployeeTeam team;



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
        if(e!=null) {
            if (team == null) {
                team = new EmployeeTeam();
            }
            team.add(e);
        }
    }

    public void printTeam(){
        System.out.println(team);
    }

    }
