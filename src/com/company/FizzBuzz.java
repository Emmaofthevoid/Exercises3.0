package com.company;

public class FizzBuzz {
    public static void main(String[] args) {
        teilbareZahlen(1);
    }

    public static void teilbareZahlen(int zahl) {
        while (zahl < 100) {
            if (zahl % 3 == 0 && zahl % 5 == 0) {
                System.out.println(zahl + " FizzBuzz");
            } else if (zahl % 3 == 0) {
                System.out.println(zahl + " Fizz");
            } else if (zahl % 5 == 0) {
                System.out.println(zahl + " Buzz");
            } else {
                System.out.println(zahl);
            }
            zahl++;
        }
    }
    public static String richtigeString (int zahl) {
    }
}
