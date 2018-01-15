package com.globallogic;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("");
        System.out.println("Using foreach loop (external iterator)");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("");
        System.out.println("Using lambdas for each (external iterator)");
        people.forEach(p -> System.out.println(p));

        System.out.println("");
        System.out.println("Using for each method references (internal iterator) - can be executed in parallel");
        people.forEach(System.out::println);

    }



}
