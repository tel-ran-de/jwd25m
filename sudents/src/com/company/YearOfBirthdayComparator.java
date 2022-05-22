package com.company;

import java.util.Comparator;

public class YearOfBirthdayComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getYearOfBirthday() - b.getYearOfBirthday();
    }
}
