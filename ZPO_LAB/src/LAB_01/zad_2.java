package LAB_01;
import java.util.Scanner;
public class zad_2 {
    public static void main(String[] arg) {
        int ilosc;
        int x;
        int y;
        System.out.println("Podaj ilość");
        Scanner il = new Scanner(System.in);
        ilosc=il.nextInt();
        System.out.println("Podaj pierwszą: ");
        Scanner skan = new Scanner(System.in);
        x=skan.nextInt();
        for (int i=0; i<ilosc-1; i++) {
            System.out.println("Podaj kolejną: ");
            Scanner sk = new Scanner(System.in);
            y=sk.nextInt();
        }
        System.out.println(x);

    }
}
