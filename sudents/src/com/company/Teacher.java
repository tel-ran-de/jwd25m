package com.company;

public class Teacher implements TaskObserver{
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        TaskListSingleton.getInstance().addObserver(this);
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void addTask(Task task) {
        TaskListSingleton tasks = TaskListSingleton.getInstance();
        tasks.addTask(task);
    }

    @Override
    public void handleEvent(TaskEvent event) {
        if (event.getType() != TaskEventType.DONE){
            return;
        }
        System.out.println("Teacher " + getName() + " sees student " + event.getStudent().getName() + " done task " + event.getTask().getId());
    }
}
