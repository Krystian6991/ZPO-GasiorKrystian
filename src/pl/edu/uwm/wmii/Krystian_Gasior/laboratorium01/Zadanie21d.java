package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie21d {
    public static void main(String[] args){
        int ile=0;
        System.out.println("Podaj liczbe n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int tab[]= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Podaj liczbe: ");
            tab[i] = in.nextInt();
        }
        for(int i=1;i<n-1;i++) // jakby bylo 0 to w ifie warunek bylby tab[-1] i wyskakiwal blad
        {
            if(tab[i]<(tab[i-1]+tab[i+1])/2)
            {
                ile++;
            }
        }
        System.out.println("Wynik: "+ile);

    }
}
