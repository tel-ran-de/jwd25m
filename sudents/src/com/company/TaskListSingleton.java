package com.company;

import java.util.ArrayList;
import java.util.List;

public final class TaskListSingleton implements TaskObservable {
    private List<Task> tasks;
    private List<TaskObserver> observers = new ArrayList<>();
    private static TaskListSingleton instance;

    private TaskListSingleton() {
        this.tasks = new ArrayList<>();
    }

    public static TaskListSingleton getInstance() {
        if (instance == null) {
            instance = new TaskListSingleton();
        }
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
        this.notifyObservers(new TaskEvent(task, TaskEventType.ADDED));
    }

    public void doTask(Task task, Student student){
        System.out.println(student.getName() + " done task " + task.getId());
        this.notifyObservers(new TaskEvent(task, student, TaskEventType.DONE));
    }

    @Override
    public void addObserver(TaskObserver taskAddedObserver) {

        observers.add(taskAddedObserver);
    }

    @Override
    public void removeObserver(TaskObserver taskAddedObserver) {

        observers.remove(taskAddedObserver);
    }


    @Override
    public void notifyObservers(TaskEvent event) {
        for(TaskObserver taskAddedObserver: observers){
            taskAddedObserver.handleEvent(event);
        }
    }
}
