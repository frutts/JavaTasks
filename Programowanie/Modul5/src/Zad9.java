import java.util.Locale;
import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz zdanie używając małych liter: ");
        String str = scanner.nextLine();

        //String str = "the quick brown fox jumps over the lazy dog.";
        String actualValue = str.toUpperCase(Locale.ROOT);
        //String expectedValue = "The Quick Brown Fox Jumps Over The Lazy Dog.";
        System.out.println("Drukowane litery: ");
        System.out.println(actualValue);







    }
}
