package com.example;

public class Zad3 {
    public static void main(String[] args){

        String String1 = "PHP Exercises and ";
        String String2 = "Python Exercises ";

        System.out.println();

        String1 = new StringBuilder(String1).append(String2).toString();
        System.out.println(String1);
    }
}
