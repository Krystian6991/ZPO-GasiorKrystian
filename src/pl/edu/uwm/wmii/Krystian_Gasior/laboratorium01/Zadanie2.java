package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] arg) {
        int ile;
        int a;
        int b;
        System.out.println("Podaj ile liczb");
        Scanner il = new Scanner(System.in);
        ile=il.nextInt();

        System.out.println("Podaj liczbe");
        Scanner skan = new Scanner(System.in);
        a=skan.nextInt();
        for (int i=0; i<ile-1; i++) {
            System.out.println("Podaj liczbe");
            Scanner sk = new Scanner(System.in);
            b=sk.nextInt();
            System.out.println(b);
        }

        System.out.println(a);

    }

}
