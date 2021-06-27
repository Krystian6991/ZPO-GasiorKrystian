package LAB_01;
import java.util.Scanner;
public class zad21_4 {
    public static void main(String[] args){
        int ilosc=0;
        System.out.println("Podaj ilość: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int tablica[]= new int[x];
        for(int i=0;i<x;i++)
        {
            System.out.println("Podaj liczbe: ");
            tablica[i] = in.nextInt();
        }
        for(int i=1;i<x-1;i++)
        {
            if(tablica[i]<(tablica[i-1]+tablica[i+1])/2)
            {
                ilosc++;
            }
        }
        System.out.println("Wynik: "+ilosc);
    }
}
