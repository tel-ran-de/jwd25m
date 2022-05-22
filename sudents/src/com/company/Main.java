package com.company;
import java.util.Comparator;
import java.util.Scanner;

/*
Паттерн "Observer"
Реализована возможность такой обработки задач, при которой класс Student
реагирует на добавление задач. Класс Teacher реагирует на изменение состояния
задач.
Класс Student и Teacher являются "наблюдателями" (реализуют интерфейс TaskObserver)
Класс  TaskListSingleton - наблюдаемый класс (TaskObservable)
*/

public class Main {

    public static void main(String[] args) {
        // Create new class Students with following fields (String name, int yearOfBirthday, double gpa).
        // Create the array of several students. Your program should ask user how to sort students (by name, by age, or by gpa)
        // and display students accordingly

        Student student1 = new Student("Dasha", 1985, 3.86);
        Student student2 = new Student("Vasia", 1997, 4.88);
        Student student3 = new Student("Alena", 1978, 5.00);
        Student[] students = {student1, student2, student3};

        /*
        System.out.println("How to sort students?");
        System.out.println("1 - by name, 2 - by age, 3 - by gpa");
        Scanner sc = new Scanner(System.in);
        int enteredValueSort = sc.nextInt();
        StudentsSort studentsSort = new StudentsSort(students);
        Comparator<Student> comp = new StudentsSortFactory().buildComparator(enteredValueSort);
        studentsSort.sortStudents(comp);
        sc.close();

        for (Student student:students) {
            System.out.println(student.getName() + " " + student.getYearOfBirthday() + " " + student.getGpa());
        }
        */

        Teacher mathTeacher = new Teacher("Petr Petrovich", "math");

        Task task1 = new Task(1, "write code");
        Task task2 = new Task(2, "review code");
        mathTeacher.addTask(task1);
        mathTeacher.addTask(task2);

        student1.doTask(task1);

    }
}
