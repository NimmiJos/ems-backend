package net.javaguides.ems_backend.controller;

import java.util.Arrays;

public class SortArrayObjectsWithLambdas {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = {
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        };

        // Print the array before sorting
        System.out.println("Before sorting:");

        printArray(people);

        Arrays.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        Arrays.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));

        // Sort the array in ascending order by age
        Arrays.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("After sorting by age in ascending order:");
        printArray(people);

        // Sort the array in descending order by age
        Arrays.sort(people, (p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
        System.out.println("After sorting by age in descending order:");
        printArray(people);

        // Sort the array in ascending order by name
        Arrays.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("After sorting by name in ascending order:");
        printArray(people);

        // Sort the array in descending order by name
        Arrays.sort(people, (p1, p2) -> p2.getName().compareTo(p1.getName()));
        System.out.println("After sorting by name in descending order:");
        printArray(people);
    }

    // Method to print the array
    private static void printArray(Person[] array) {
        for (Person person : array) {
            System.out.println(array);
        }
    }
}
