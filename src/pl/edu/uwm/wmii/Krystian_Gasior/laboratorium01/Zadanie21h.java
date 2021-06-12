package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie21h {
    public static void main(String[] args) {
        int ile = 0;
        System.out.print("Podaj liczbe n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            int x = in1.nextInt();
            if (Math.abs(x) < Math.pow(i, 2)) // |ak|<k^2
            {
                ile++;
            }
        }
        System.out.println("Wynik: " + ile);
    }
}