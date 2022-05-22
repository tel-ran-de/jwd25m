package com.company;

public interface TaskObservable {
    void addObserver(TaskObserver taskObserver);
    void removeObserver(TaskObserver taskObserver);
    void notifyObservers(TaskEvent event);
}
