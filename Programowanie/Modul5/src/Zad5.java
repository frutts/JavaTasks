import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Podane liczby są równe");
        }
        else if (a > b) {
            System.out.println("Pierwsza liczba jest większa");
        }
        else {
            System.out.println("Druga liczba jest większa");
        }


    }
}
