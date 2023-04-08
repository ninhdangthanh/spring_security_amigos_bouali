package io.getarrays.userservice.service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamRun {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Stream", "API", "Programming");
        list.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        List<Integer> nums = Arrays.asList(1,2,3,4,5,5,2,4,6,7);

        double numsss = nums.stream()
                .map(i -> i + 2)
                .mapToDouble(Integer::doubleValue)
                .sum();
        System.out.println(numsss);


    }
}

class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }
}
