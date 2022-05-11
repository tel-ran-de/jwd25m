package com.company;

public class Observer1 implements Observer {
    @Override
    public void handleEvent() {
        System.out.println("Observer1 is handling the event");
    }
}
