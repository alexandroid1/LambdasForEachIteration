package com.globallogic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // external iterators

        System.out.println("Using for loop (external iterator)");
        // people
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        // numbers
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }


        // external iterators also
        // people
        System.out.println("");
        System.out.println("Using foreach loop (external iterator)");
        for (Person p : people) {
            System.out.println(p);
        }
        // numbers
        for(int e:numbers){
            System.out.println(e);
        }

        // people
        System.out.println("");
        System.out.println("Using lambdas for each (external iterator)");
        people.forEach(p -> System.out.println(p));

        //internal iterator
        // numbers
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        });
        // numbers
        numbers.forEach(n -> System.out.println(n));

        System.out.println("");
        System.out.println("Using lambdas for each (external iterator) + parallel");
        people.parallelStream().forEach(p -> System.out.println(p));

        System.out.println("");
        System.out.println("Using for each method references (internal iterator) - can be executed in parallel");
        // people
        people.forEach(System.out::println);
        // numbers
        numbers.forEach(System.out::println);

    }

}
