package com.company;

public class Observer2 implements Observer {
    @Override
    public void handleEvent() {
        System.out.println("Observer2 is handling the event");
    }
}
