package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in inches: ");
        double x = scanner.nextDouble();
        double y = x * 0.0254;
        System.out.println(x + " inches in meters is equal: " + y);
    }
}
