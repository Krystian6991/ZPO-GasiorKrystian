package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        int ileZer=0;
        int ilePlus=0;
        int ileMinus=0;
        System.out.print("Podaj liczbe n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0;i<n;i++) {
            System.out.print("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            int x = in1.nextInt();
            if(x==0)
            {
                ileZer++;
            }
            else if(x>0)
            {
                ilePlus++;
            }
            else if(x<0)
            {
                ileMinus++;
            }
        }
        System.out.println("Ilosc zer: "+ileZer);
        System.out.println("Ilosc dodatnich: "+ilePlus);
        System.out.println("Ilosc ujemnych: "+ileMinus);
    }
}
