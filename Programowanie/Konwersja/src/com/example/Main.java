package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please input a number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int integer = Integer.parseInt(number);

        System.out.println("The integer value is: " + number);


    }
}
