package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentSortFactoryTest {
    @Test
    public void testReturnNameComparator(){
        StudentsSortFactory subject = new StudentsSortFactory();
        Assertions.assertInstanceOf(NameComparator.class, subject.buildComparator(1));
    }

    @Test
    public void testReturnYearOfBirthdayComparator(){
        StudentsSortFactory subject = new StudentsSortFactory();
        Assertions.assertInstanceOf(YearOfBirthdayComparator.class, subject.buildComparator(2));
    }

    @Test
    public void testReturnGPAComparator(){
        StudentsSortFactory subject = new StudentsSortFactory();
        Assertions.assertInstanceOf(GPAComparator.class, subject.buildComparator(3));
    }
}
