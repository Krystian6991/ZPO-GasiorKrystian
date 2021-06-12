package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie21e {
    public static int Silnia(int n)
    {
        if(n==0) return 1;
        else return n*Silnia(n-1);
    }
    public static void main(String[] args)
    {
        int ile=0;
        System.out.println("Podaj liczbe n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int tab[]= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Podaj liczbe: ");
            tab[i] = in.nextInt();
            if(Math.pow(2,i+1)<tab[i] && tab[i]<Silnia(i+1))
            {
                ile++;
            }
        }
        System.out.println("Wynik: "+ile);
    }
}
