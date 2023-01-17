package org.soneech.tasks.variant22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Comparable<Integer>> numbers = new ArrayList<>();
        int[] nums = new int[] {1, 8, 0, -3, 14, 3, 83, 11};
        for (int num : nums)
            numbers.add(num);
        System.out.println(numbers);

        BubbleSorter<Integer> integerSorter = new BubbleSorter<>();
        List<Comparable<Integer>> sortedList = integerSorter.sort(numbers);
        System.out.println(sortedList);

        List<Comparable<Person>> persons = new ArrayList<>();
        Comparable<Person> person1 = new Person(15, "Kate");
        Comparable<Person> person2 = new Person(20, "Ann");
        Comparable<Person> person3 = new Person(10, "Peter");
        Comparable<Person> person4 = new Person(19, "Ivan");
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        for (Comparable<Person> person: persons) {
            System.out.print(person + " ");
        }
        System.out.println();

        BubbleSorter<Person> personSorter = new BubbleSorter<>();
        List<Comparable<Person>> sortedPersons = personSorter.sort(persons);
        for (Comparable<Person> person: sortedPersons) {
            System.out.print(person + " ");
        }
        System.out.println();
    }
}
