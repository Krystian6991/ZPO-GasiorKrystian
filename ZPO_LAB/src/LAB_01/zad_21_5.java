package LAB_01;
import java.util.Scanner;
public class zad_21_5 {
    public static int Silnia(int x)
    {
        if(x==0) return 1;
        else return x*Silnia(x-1);
    }
    public static void main(String[] args)
    {
        int ilosc=0;
        System.out.println("Podaj ilość: ");
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int tablica[]= new int[y];
        for(int i=0;i<y;i++)
        {
            System.out.println("Podaj liczbe: ");
            tablica[i] = in.nextInt();
            if(Math.pow(3,i+1)<tablica[i] && tablica[i]<Silnia(i+1))
            {
                ilosc++;
            }
        }
        System.out.println("Wynik: "+ilosc);
    }
}
