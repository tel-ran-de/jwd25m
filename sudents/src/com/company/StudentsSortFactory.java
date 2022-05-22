package com.company;

import java.util.Comparator;

public class StudentsSortFactory {
    public Comparator<Student> buildComparator(int enteredValueSort) {
        switch (enteredValueSort) {
            case 1:
                return new NameComparator();
            case 2:
                return new YearOfBirthdayComparator();
            case 3:
                return new GPAComparator();
        }
        return null;
    }
}

