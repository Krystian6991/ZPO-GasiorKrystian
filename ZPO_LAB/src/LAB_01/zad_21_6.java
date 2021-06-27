package LAB_01;
import java.util.Scanner;
public class zad_21_6 {
    public static void main(String[] args) {
        int ilosc=0;
        System.out.print("Podaj ilość: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i=1;i<=x;i++)
        {
            System.out.print("Podaj liczbe: ");
            Scanner inl = new Scanner(System.in);
            int y = inl.nextInt();
            if(i%2!=0 && y%2==0)
            {
                ilosc++;
            }
        }
        System.out.println("Wynik: "+ilosc);
    }
}
