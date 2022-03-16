package com.company;
/*
Do you remember the tasks about students and grades?
Try to create the class or classes those ft best for this task
 */

public class Main {

    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Ivan Ivanov";
        student1.rates = new int[]{3,4,2,5};

        Student student2=new Student();
        student2.name="Pavel Pavlov";
        student2.rates = new int[]{3,5,3,4,3,3,5};

        Student[] students={student1,student2};
        for (int i = 0; i < students.length ; i++) {
            printStudent(students[i]);
        }

        System.out.println(student1.name);
    }

    public static void printStudent(Student student){
        System.out.println(student.name);
        System.out.print("rates: ");
        for (int i = 0; i < student.rates.length ; i++) {
            System.out.print(student.rates[i]+ " ");
        }
        System.out.println();
        System.out.println();

    }

}
