package LAB_01;
import java.util.Scanner;
public class zad21_3 {
    public static void main(String[] args) {
        int ilosc=0;
        System.out.println("Podaj ilość: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i=0;i<x;i++)
        {
            System.out.print("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            double y = in1.nextDouble();
            if(Math.sqrt(y)%2==0) {
                ilosc++;
            }
        }
        System.out.println("Wynik: "+ilosc);
    }
}
