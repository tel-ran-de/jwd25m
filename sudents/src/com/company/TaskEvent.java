package com.company;

public class TaskEvent {
    Task task;
    Student student;
    TaskEventType type;

    public TaskEvent(Task task, Student student, TaskEventType type) {
        this.task = task;
        this.student = student;
        this.type = type;
    }

    public TaskEvent(Task task, TaskEventType type) {
        this.task = task;
        this.type = type;
    }

    public Task getTask() {
        return task;
    }

    public Student getStudent() {
        return student;
    }

    public TaskEventType getType() {
        return type;
    }
}
