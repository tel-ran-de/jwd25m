package com.company;

public class StringToUpperCaseTransformer {
    private String string;

    public StringToUpperCaseTransformer(String string) {
        this.string = string;
    }
    public String getTransformedString(){
        if(string==null) return "";
        return string.toUpperCase();
    }

}
