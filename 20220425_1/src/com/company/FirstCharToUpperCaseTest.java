package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstCharToUpperCaseTest {
    FirstCharToUpperCase firstCharToUpperCase;

    @BeforeEach
    public  void init(){
        System.out.println("Test");
        this.firstCharToUpperCase=new FirstCharToUpperCase();
    }

    @Test
    @DisplayName("check normal case")
    void firstCharToUpperCaseForStringWithLowerFirstChar() {
        String given="hello java";
        Assertions.assertEquals("Hello java",firstCharToUpperCase.transform(given) );
    }
    @Test
    void firstCharToUpperCaseForStringWithUpperFirstChar() {
        String given="Hello java";
        Assertions.assertEquals("Hello java",firstCharToUpperCase.transform(given) );
    }

    @Test
    void firstCharToUpperCaseForNullString() {
        String given=null;
        Assertions.assertEquals("",firstCharToUpperCase.transform(given) );
    }

    @Test
    void firstCharToUpperCaseForEmptyString() {
        String given="";
        Assertions.assertEquals("",firstCharToUpperCase.transform(given) );
    }

    @Test
    void firstCharToUpperCaseForOneCharString() {
        String given="w";
        Assertions.assertEquals("W",firstCharToUpperCase.transform(given) );
    }


}