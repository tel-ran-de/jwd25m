package com.company;

import java.util.ArrayList;
import java.util.List;

public class ObservedClass implements Observable {
    String str;
    private List<Observer> list = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: list) {
            observer.handleEvent();
        }
    }

    public void setStr(String str) {
        this.str = str;
        this.notifyObservers();
    }
}
