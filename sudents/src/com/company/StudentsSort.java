package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class StudentsSort {
    private Student[] students;

    public StudentsSort(Student[] students){
        this.students = students;
    }

    public void sortStudents(Comparator<Student> comparator){
        Arrays.sort(this.students, comparator);
    }
}
