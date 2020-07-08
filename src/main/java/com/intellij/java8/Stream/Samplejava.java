package com.intellij.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Samplejava {
    public static void main(String[] args) {
        Map<Integer, String> valp =new HashMap<>();
        valp.put(1,"Vijay");
        valp.put(4,"rahul");
        valp.put(7,"mohit");
        Set<Map.Entry<Integer, String>> value =valp.entrySet();
        value.stream().filter( t->t.getKey()%2==0).forEach( System.out::println);
    }
}