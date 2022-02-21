package com.example;

public class Main {

    public static void main(String[] args) {

        String stringLiteral = new String("computer");
        String anotherSTring = new String("computer");

        if (stringLiteral == (anotherSTring)) {
            System.out.println("Strings are equal");

        }

        String emptyString = "";
        String anotherEmptyString = new String("");
                String yetAnotherEmptyString = new String();

        System.out.println(emptyString.length());

        String nullString = null;

        String textBlock = """
                This is the first line
                This is the 2nd line
                This is the 3rd line
                """;

        String firstString = "first ";
        String secondString = "second ";
        String thirdString = "third ";

        String outcome = firstString + secondString + thirdString;
        String sndOutcome = String.join(", ", firstString, secondString, thirdString);

        System.out.println(outcome);
        System.out.println(sndOutcome);

        StringBuilder sb = new StringBuilder(("Hello "));
        sb.append("you!");
        sb.append("you!");
        sb.append("you!");

        System.out.println(sb);

        sb.insert(3, "something");
        System.out.println(sb);

        sb.replace(1,4, "****");
        System.out.println(sb);

        String newString = "Hello, Student! ";
        System.out.println(newString.substring(0, 5));

        String newConcatString = firstString.concat(secondString);
        System.out.println(newConcatString);

        System.out.println("Index of ;'h' is: " + thirdString.indexOf('h'));
        System.out.println("Character at position 3 is: " + secondString.charAt(3));


        String usplitted = "John,Marry,Jack,Chris";
        String[] splitted = usplitted.split(",");

        for (String name: splitted) {
            System.out.println(name);

        }


    }


}
