package com.company;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString(){
        return this.day+"/"+this.month+"/"+this.year;
    }


    public void print(){
        System.out.println(this.toString());
    }


}
