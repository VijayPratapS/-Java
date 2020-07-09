package com.intellij.java8.Stream;

import java.util.*;
public class Samplejava {
    public static void main(String[] args) {
        List<Person> per= Arrays.asList(new Person("Vijay","pratap",66),new Person("rahul","Kumar",66));
        //Set<Map.Entry<Integer, String>> value =valp.entrySet();
        per.stream().filter( t-> {
            return t.getFirstname().startsWith("V");}).forEach( System.out::println);
    }
}