package com.company;

public class Book {
    String title;
    Author author;
    double price;

    public Book(String t, Author a, double p){
        title= t;
        author=a;
        price=p;
    }

    public  void print(){
        System.out.println("Author: " + author.firstName + " " + author.lastName );
        System.out.println("Title: "+ title);
        System.out.println("Price: "+ price);
    }

}
