package LAB_01;
import java.util.Scanner;
public class zad_25 {
    public static void main(String[] args) {
        System.out.println("Podaj ilość: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int tablica[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Podaj liczbe: ");
            tablica[i] = in.nextInt();
        }
        for (int i = 0; i < x - 1; i++) {
            if (tablica[i] > 0 && tablica[i + 1] > 0) {
                System.out.println(tablica[i]+" | "+tablica[i + 1]);
            }
        }
    }
}