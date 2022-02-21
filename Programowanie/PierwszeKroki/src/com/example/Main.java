package com.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name, please: ");
    String userName = scanner.nextLine();

    System.out.println("Hello, " + userName + "!");


    System.out.println("Enter your age, please: ");

    int age = 0;
    if (scanner.hasNextInt()){
        age = scanner.nextInt();
    } else {
        System.out.println("Type mismatch. Please try again!");
    }

    System.out.println("Your age is: " + age);

        System.out.println("This is my multiapp. Please choose an option: ");
        System.out.println("A: Adding");
        System.out.println("B: Multiplying");
        System.out.print("Enter your choice: ");

        String userSelection = scanner.next();
        System.out.println("You chose: "+ userSelection);

        if (userSelection.equals("A")){
            System.out.println("You chose adding. Please follow instructions on screen.");

            System.out.println("Enter first  number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();

            int sum = firstNumber + secondNumber;

            System.out.println("Sum equals: " + sum);
        }
        System.out.println("Thank you for using my beautiful app!");



    }
}
