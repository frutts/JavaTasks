package com.example;

public class Zad2 {
    public static void main(String[] args) {

        String String1 = "This is Exercise 1 ";
        String String2 = "This is Exercise 2 ";

        if (String1.compareTo(String2) < 0) {
            System.out.println(("\"" + String1 + "\" is less than \""+ String2 + "\" "));
        } else if (String1.compareTo(String2)> 0){
            System.out.println(("\"" + String2 + "\" is less than \""+ String1 + "\" "));
        } else{
            System.out.println(("\"" + String1 + "\" is equal to \""+ String2 + "\" "));
        }
    }
}
