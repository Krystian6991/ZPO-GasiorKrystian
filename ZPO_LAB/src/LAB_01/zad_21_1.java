package LAB_01;
import java.util.Scanner;
public class zad_21_1 {
    public static void main(String[] args) {
        int ilosc=0;
        System.out.print("Podaj ilość: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i=0;i<x;i++)
        {
            System.out.print("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            int y = in1.nextInt();
            if(y%2!=0) {
                ilosc++;
            }
        }
        System.out.println("Wynik: "+ilosc);
    }
}
