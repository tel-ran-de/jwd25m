package com.company;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.getGpa() == b.getGpa()){
            return 0;
        }
        if (a.getGpa() > b.getGpa()){
            return 1;
        }
        return -1;
    }
}
