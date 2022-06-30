package com.company;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	   test(10.3,20.2, (n1,n2)-> Math.min(n1,n2));  // (arg) -> Class.staticMethod(arg)
       test(10.3,20.2, Math::min);

        String s="qwertyui";
        Stream.iterate(0,i->i+1)
                .limit(s.length())
                .map(s::charAt) // i->s.charAt(i)   // (arg) -> inst.method(arg)
                .forEach(System.out::println); // s->System.out.println(s)

        Stream.of("12","qwer","34567")
                .sorted(Comparator.comparing(String::length)) //  s->s.length()
                .forEach(System.out::println);  //

        //()-> new TreeMap<String,Integer>   // TreeMap<String,Integer>::new
        // int[]::new    len-> new int[len]


    }

    public static void test(Double num1, Double num2, BiFunction<Double,Double,Double> func){
        System.out.println(func.apply(num1,num2));
    }
}
