package com.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number, please: ");
        int Number1 = scanner.nextInt();
        System.out.println("Enter second number, please ");
        int Number2 = scanner.nextInt();
        System.out.println("Enter third number, please ");
        int Number3 = scanner.nextInt();

        if (Number1 + Number2 == Number3){
            System.out.println("true");
        } else {
            System.out.println("false");
        }



    }
}
