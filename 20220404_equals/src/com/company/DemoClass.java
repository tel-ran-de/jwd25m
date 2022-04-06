package com.company;

public class DemoClass {
    private int num1;
    private int num2;
    private String str1;
    private String str2;

    public DemoClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public int getMax(){
        /*
        if (num1>num2){
            return num1;
        } else {
            return num2;
        }

         */

        return  (num1>num2)? num1 : num2;
    }

    public String isStringEquals(){
        return "Эти строчки  " + ((str1.equals(str2))? "равны":"не равны");
    }

}
