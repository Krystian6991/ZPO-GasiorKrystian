package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie25 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int tab[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe: ");
            tab[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (tab[i] > 0 && tab[i + 1] > 0) {
                System.out.println(tab[i]+" | "+tab[i + 1]);
            }
        }
    }
}
