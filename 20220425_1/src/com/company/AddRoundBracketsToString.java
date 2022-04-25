package com.company;

public class AddRoundBracketsToString {
    public String transform(String string){
        if(string==null||string.isEmpty()) return "()";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(string);
        stringBuilder.append(')');

        return stringBuilder.toString();
    }
}
