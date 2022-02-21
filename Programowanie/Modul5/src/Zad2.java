import java.util.Arrays;

public class Zad2 {
    public static void main(String[] args) {

        int[] tablica = new int[10];

        for (int i = 0; i < 10; i++) {
            tablica[i] = 2 * i +3;
            //System.out.println(Arrays.toString(tablica));

            if (tablica[i] > 10){
                System.out.println("Liczba " + tablica[i] + " większa niż 10");
            }else{
                System.out.println("Liczba " + tablica[i] + " mniejsza niż 10");
            }
        }

    }
}
