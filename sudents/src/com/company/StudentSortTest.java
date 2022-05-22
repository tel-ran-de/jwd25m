package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentSortTest {
    @Test
    public void testSortByName() {
        Student student1 = new Student("Dasha", 1985, 3.86);
        Student student2 = new Student("Vasia", 1997, 4.88);
        Student student3 = new Student("Alena", 1978, 5.00);
        Student[] students = {student1, student2, student3};
        StudentsSort sorter = new StudentsSort(students);
        sorter.sortStudents(new NameComparator());
        Assertions.assertEquals(students[0], student3);
        Assertions.assertEquals(students[1], student1);
        Assertions.assertEquals(students[2], student2);
    }

    @Test
    public void testSortByYearOfBirthday() {
        Student student1 = new Student("Dasha", 1985, 3.86);
        Student student2 = new Student("Vasia", 1997, 4.88);
        Student student3 = new Student("Alena", 1978, 5.00);
        Student[] students = {student1, student2, student3};
        StudentsSort sorter = new StudentsSort(students);
        sorter.sortStudents(new YearOfBirthdayComparator());
        Assertions.assertEquals(students[0], student3);
        Assertions.assertEquals(students[1], student1);
        Assertions.assertEquals(students[2], student2);
    }

    @Test
    public void testSortByGPA() {
        Student student1 = new Student("Dasha", 1985, 3.86);
        Student student2 = new Student("Vasia", 1997, 4.88);
        Student student3 = new Student("Alena", 1978, 3.00);
        Student[] students = {student1, student2, student3};
        StudentsSort sorter = new StudentsSort(students);
        sorter.sortStudents(new GPAComparator());
        Assertions.assertEquals(students[0], student3);
        Assertions.assertEquals(students[1], student1);
        Assertions.assertEquals(students[2], student2);
    }
}
