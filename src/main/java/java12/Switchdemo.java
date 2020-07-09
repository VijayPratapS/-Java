package java12;

import java.util.Scanner;

public class Switchdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String day=sc.next();
        daysFinder(day);
    }
    public static void daysFinder(String days)
    {    switch (days)
        {
            case  "monday","tuesday","wednesday","thrusday","friday" -> System.out.println("its weekdays" + days);
            case "staurday","sunday"-> System.out.println("yeah its weekend"+days);
            default -> System.out.println("invalid days");
        }
    }
}
