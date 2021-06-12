package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie21c {
    public static void main(String[] args) {
        int ile=0;
        System.out.println("Podaj liczbe n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.print("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            double x = in1.nextDouble();
            if(Math.sqrt(x)%2==0) {
                ile++;
            }
        }
        System.out.println("Wynik: "+ile);
    }
}
