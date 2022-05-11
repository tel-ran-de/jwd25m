package com.company;

/**
 * Singleton
 */

public class Manager {
    private static  Manager INSTANCE;
    String name;

    private Manager(String name) {
        this.name = name;

    }

    public  static Manager getInstance(String name){
        if (INSTANCE==null){
            INSTANCE= new Manager(name);
        }
        return INSTANCE;

    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }
}
