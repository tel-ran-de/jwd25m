package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToUpperCaseTransformerTest {

    @Test
    public void getTransformedStringTest(){
        StringToUpperCaseTransformer s=new StringToUpperCaseTransformer("qwer");
        Assertions.assertEquals("QWER", s.getTransformedString());
        StringToUpperCaseTransformer s1=new StringToUpperCaseTransformer(null);
        Assertions.assertEquals("", s1.getTransformedString());
    }

}
