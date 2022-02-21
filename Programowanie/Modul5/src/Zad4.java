import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Zad4 {
    public static void main(String[] args) {

        System.out.println();
        LinkedList m = new LinkedList();
        Random generator = new Random();

        for (int i = 0; i < 50; i++) {


            m.add(generator.nextInt(50));
        }
        System.out.println(m);

        int [] tab = {21, 25, 44, 7, 9, 37, 47, 5, 47, 48, 11, 25, 48, 39, 5, 32, 21, 14, 36, 42, 1, 34, 27, 45, 43, 35, 24, 29, 36, 6, 31, 20, 32, 47, 2, 18, 31, 13, 46, 45, 27, 15, 37, 14, 1, 29, 8, 25, 10, 35};
        Arrays.sort(tab);
        System.out.println();
        System.out.println("Sortowanie w porządku rosnącym: " + Arrays.toString(tab));

        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];

        }
        System.out.println();
        System.out.println("Suma wszystkich elementów wynosi: " + sum);

        int[] kopiaLiczb = Arrays.copyOf(tab, tab.length);
        System.out.println();
        System.out.println("Oryginał: "+ Arrays.toString(tab));
        System.out.println("Kopia: "+ Arrays.toString(kopiaLiczb));








    }
}
