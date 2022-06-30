package com.company;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // toSet toList toUnmodifiableList() UnmodifiableSet()
        System.out.println("1: "+
                Stream.of("qwe1", "qwe2", "qwe3", "qwe4", "qwe5")
                //.collect(Collectors.toUnmodifiableList())
                .collect(Collectors.toSet())
                        //.add("poiuy")
        );

        // toCollection
        System.out.println("2: "+
                Stream.of("qwe11", "qw2", "qwe3231", "qwe411111", "q5")
                        .collect(Collectors.toCollection(
                                ()->new TreeSet<>(Comparator.comparing(String::length))
                        ))
        );


        // joining
        System.out.println("3: "+
                Stream.of("qwe1", "qwe2", "qwe3", "qwe4", "qwe5")
                        .collect(Collectors.joining()  )
                        //.collect(Collectors.joining()  )
                        //.collect(Collectors.joining("-","Prefix: "," :Suffix")  )
        );

        // collectingAndThen
        System.out.println("4: "+
                Stream.of("4qwe", "1qwe", "3qwe", "2qwe", "1qwe")
                        .collect(Collectors.collectingAndThen(
                                Collectors.toCollection(TreeSet::new),
                                s->s.tailSet("3qwe")
                        ))
        );

        // toMap
        System.out.println("5: "+
                Stream.of("1qwe", "2qwe", "33qwe", "44qwe", "555qwe")   //IllegalStateException: Duplicate key
                        .collect(Collectors.toMap(s -> s,s->s.length()))
        );

        System.out.println("6: "+
                Stream.of("1qwe", "2qwe", "33qwedfghj", "44qwe", "555qwe")
                        .collect(Collectors.toMap(s -> s.length(),
                                                  s->s  ,
                                                    (s,s1)->s1+"/"+s))
        );


        // groupingBy
        System.out.println("7: "+
                Stream.of("4qwe11", "1qwe", "3qwe22", "2qwe333", "1qwe")
                        .collect(Collectors.groupingBy(String::length)
                        )
        );

        // groupingBy
        System.out.println("8: "+
                Stream.of("4qwe11", "1qwe", "3qwe22", "2qwe333", "1qwe")
                        .collect(Collectors.groupingBy(String::length, Collectors.toSet())
                        )
        );

        // groupingBy
        System.out.println("9: "+
                Stream.of("4qwe11", "1qwe", "3qwe22", "2qwe333", "1qwe")
                        .collect(Collectors.partitioningBy(s->s.length()>4)
                        )
        );

        // groupingBy
        System.out.println("10: "+
                Stream.of("4qwe11", "1qwe", "3qwe22", "2qwe333", "1qwe")
                        .collect(Collectors.partitioningBy(s->s.length()>4, Collectors.toSet())
                        )
        );

        // mapping
        System.out.println("11: "+
                Stream.of("4qwe11", "1qwe", "3qwe22", "2qwe333", "1qwe")
                        .collect(Collectors.mapping(s->s.toUpperCase(), Collectors.toList()))
        );

        //teeing
        System.out.println("12: "+
                Stream.of(1,2,3,4,5)
                        .collect(Collectors.teeing(
                                Collectors.minBy(Comparator.comparing(Integer::intValue)),
                                Collectors.averagingInt(Integer::intValue),
                                (min,avg)->{return avg-min.get();}
                        ))
        );


        Collector<String,Set<String>,List<String>> collector= new Collector<String, Set<String>, List<String>>() {
            @Override
            public Supplier<Set<String>> supplier() {
                return ()-> new HashSet<String>();
            }

            @Override
            public BiConsumer<Set<String>, String> accumulator() {
                return (set,str)-> set.add(new StringBuilder(str.toUpperCase()).reverse().toString());
            }

            @Override
            public BinaryOperator<Set<String>> combiner() {
                return (set1,set2) ->{
                    set1.addAll(set2);
                    return set1;
                };
            }

            @Override
            public Function<Set<String>, List<String>> finisher() {
                return set->new ArrayList<>(set);
            }

            @Override
            public Set<Characteristics> characteristics() {
                return Set.of(Characteristics.UNORDERED);
            }
        };

        // mapping
        System.out.println("13: "+
                Stream.of("4qwe11", "1qwe", "3qwe22", "2qwe333", "1qwe")
                        .collect(collector)
        );

    }
}
