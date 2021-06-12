package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium02;
import java.util.Scanner;
import java.util.Random;

public class Zadanie1a {
    public static void main(String[] args) {
        int parz=0;
        int nieparz=0;
        int ujemne=0;
        int dodatnie=0;
        int zero=0;
        int max=0;
        int suma1=0;
        int sumadod=0;
        int sumauj=0;
        int tymcz;
        int ciag=0;
        int tymczasowa=0;
        int[] ciagi;
        ciagi=new int[100];

        System.out.println("Podaj liczbe n z przedziału od 1 do 100");
        Scanner podaj = new Scanner(System.in);
        int n = podaj.nextInt();
        int[] tab;
        tab = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = r.nextInt(1998)-999;
        }
        for (int j=0; j<n; j++) {
            System.out.print(tab[j]+" ");
        }
        for (int k=0; k<n; k++) {
            if (tab[k]%2==0) {
                parz++;
            }
            if (tab[k]%2!=0){
                nieparz++;
            }
            if (tab[k]==0) {
                zero++;
            }
            if (tab[k]<0) {
                ujemne++;
                sumauj+=tab[k];
            }
            if (tab[k]>0) {
                dodatnie++;
                sumadod+=tab[k];
            }
            if (tab[k]>max) {
                max=tab[k];
                if (tab[k]==max) {
                    suma1++;
                }
            }
        }
        System.out.println();
        System.out.println("Liczb parzystych jest "+parz);
        System.out.println("Liczb nieparzystych jest "+nieparz);
        System.out.println("Liczb dodatnich jest "+dodatnie);
        System.out.println("Liczb ujemnych jest "+ujemne);
        System.out.println("Zer jest "+zero);
        System.out.println("Wartosc maksymalna tablicy to "+max+" i wystepuje"+suma1+" razy");
        System.out.println("Suma licz dodatnich wynosi "+sumadod);
        System.out.println("Suma liczb ujemnych wynosi "+sumauj);
        System.out.println("Które wartosci chcesz odwrocic?");


        int[] tabzast;
        tabzast =  new int[n];
        for (int o=0; o<n; o++) {
            tabzast[o]=tab[o];
        }


        int lewy = podaj.nextInt();
        int prawy = podaj.nextInt();
        if (lewy>prawy) {
            System.out.println("blad! lewy wiekszy od prawego!");
        }
        else {
            int liczn=(prawy-lewy)/2+lewy;
            while (lewy<liczn) {
                tymcz = tabzast[lewy];
                tabzast[lewy] = tabzast[prawy];
                tabzast[prawy] = tymcz;
                lewy++;
                prawy--;
            }
        }
        for (int m=0; m<n; m++) {
            System.out.print(tabzast[m]+" ");
        }

        for (int t: tab) {
            if(t>0) {
                ciag++;
                if (ciag>tymczasowa) {
                    tymczasowa=ciag;
                }
            }
            else {
                ciag=0;

            }

        }
        if (tymczasowa<=ciag) {
            System.out.println("Najdluzszy "+ciag);
        }
        else {
            System.out.println("Najdluzszy "+tymczasowa);
        }



        System.out.println();


        System.out.println("Znaki: -1 to liczba ujemna a 1 dodatnia");
        for (int p=0; p<n; p++) {
            if (tab[p]>0) {
                tab[p]=1;
            }
            if (tab[p]<0) {
                tab[p]=-1;
            }
        }
        for (int s=0; s<n; s++) {
            System.out.print(tab[s]+" ");
        }


    }
}
