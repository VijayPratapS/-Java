package com.intellij.java8.Stream;

import lombok.Data;


@Data
public class Person {
    private  String firstname;
    private String lastName;
    private int id;
    public Person(String vijay, String s, int id) {
        this.firstname=vijay;
        this.lastName=s;
        this.id=id;

    }



}
