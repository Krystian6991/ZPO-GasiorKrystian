package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie24 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int min=0;
        int max=0;

        for(int i=0;i<n;i++)
        {
            System.out.println("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            int a = in1.nextInt();

            if (i==0)
            {
                min=a;
                max=a;
            }
            else {
                if (a > max) {
                    max = a;
                }
                if(a<min)
                {
                    min=a;
                }
            }
        }
        System.out.println("Minimum:" +min);
        System.out.println("Maximum:" +max);

    }
}
