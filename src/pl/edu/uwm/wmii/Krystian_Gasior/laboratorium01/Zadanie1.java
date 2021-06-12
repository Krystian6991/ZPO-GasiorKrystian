package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium01;
import java.util.Scanner;

public class Zadanie1 {


    public static int Silnia (int liczba) {
        if (liczba==0) return 1;
        else return liczba*Silnia(liczba-1);
    }

    public static void main(String[] arg) {
        int n;
        int a;
        int wyn1=0;
        int wyn2=1;
        int wyn3=0;
        float wyn4=0;
        int wyn5=1;
        int wyn6=0;
        int wyn7=0;
        int wyn8=0;
        System.out.println("Podaj liczbę n");
        Scanner skan = new Scanner(System.in);
        n=skan.nextInt();


        for (int i=0; i<n; i++) {
            System.out.println("Podaj liczbę");
            Scanner liczba = new Scanner(System.in);
            a = liczba.nextInt();
            wyn1 += a;
            wyn2 *= a;
            wyn3 += Math.abs(a);
            wyn4 += Math.sqrt(Math.sqrt(a));
            wyn5 *= Math.abs(a);
            wyn6 += Math.pow(a, 2);
            wyn7 += Math.pow((-1),i)*a;

            for (int j=0; j>n; j++) {
                wyn8+= (Math.pow((-1),i+1)*a)/Silnia(j);
            }

        }
        System.out.println("a1+a2+...+an="+wyn1);
        System.out.println("a1*a2*...*an="+wyn2);
        System.out.println("|a1|+|a2|+...+|an|="+wyn3);
        System.out.println("sqrt|a1|+sqrt|a2|+...+sqrt|an|="+wyn4);
        System.out.println("|a1|*|a2|*...*|an|="+wyn5);
        System.out.println("a1^2+a2^2+...+an^2="+wyn6);
        System.out.println("a1+a2+...+an="+wyn1+" oraz "+"a1*a2*...*an="+wyn2);
        System.out.println("a1-a2+...+(-1)^n+1*an="+wyn7);
        System.out.println("Ostatnie="+wyn8);




}}
