package com.company;

public class Student implements TaskObserver {
    private String name;
    private int yearOfBirthday;
    private double gpa;

    public Student(String name, int yearOfBirthday, double gpa) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.gpa = gpa;
        TaskListSingleton.getInstance().addObserver(this);
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void handleEvent(TaskEvent event) {
        if (event.getType() != TaskEventType.ADDED) {
            return;
        }
        System.out.println("Student " + getName() + " sees a task " + event.getTask().getId());
    }

    public void doTask(Task task){
        TaskListSingleton.getInstance().doTask(task, this);
    }

}
