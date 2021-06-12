package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        int suma=0;
        System.out.print("Podaj liczbe n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0;i<n;i++) {
            System.out.print("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            int x = in1.nextInt();
            if(x>0)
            {
                suma+=x;
            }
        }
        System.out.println("Wynik: "+2*suma);
    }
}
