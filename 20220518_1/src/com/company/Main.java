package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        List<Integer> list1 = Arrays.asList(1,2,3,4,4);

        List<Integer> list4 = new ArrayList<>(list1);
        System.out.println(list1);
        list4.add(3);
        System.out.println(list4);

        //list1.remove(3);
        //list1.add(2);

        for (int i:list4){
            if(i==3){
                list4.remove(3);
            }
        }
    }
}
