package com.company;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] str={"1","2","3"};
        String[] str1= Arrays.copyOf(str,str.length+1); // str.length=str.length+1;

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(str1));

    }
}
