package com.company;
/*
Make class Book. It should contain two fields: author and title. The author is a
Class with the following field firstName, lastName, yearOfBirth.
Implement the method of printing the Book
 */
public class Main {

    public static void main(String[] args) {

	   Author author1= new Author("Alexandr","Pushkin",1799);
	   Book book1= new Book("Ruslan and Ludmila", author1, 2.38);



	   Author author2 = new Author("Lev","Tolstoy",1828);
	   Book book2= new Book("Voina i mir", author2,3.55);


		String str="12345678";
		str.length();
		str.substring(6,9);

	   book1.print();
	   book2.print();
    }


}
