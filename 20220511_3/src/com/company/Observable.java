package com.company;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();

}
