package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium02;

import java.util.Random;

public class Zadanie2 {

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = r.nextInt(Math.abs(minWartosc)+maxWartosc)+maxWartosc;
        }
    }

    public static int ileParzystych(int tab[]) {

        int parz=0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i]%2==0) {
                parz++;
            }
        }
         return parz;
    }

    public static int ileNieparzystych(int tab[]) {
        int nieparz=0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i]%2 !=0) {
                nieparz++;
            }
        }
        return nieparz;
    }

    public static int ileDodatnich(int tab[]) {
        int wyn=0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i]>0) {
                wyn++;
            }
        }
        return wyn;
    }

    public static int ileUjemnych(int tab[]) {
        int wyn = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                wyn++;
            }
        }
        return wyn;
    }
        public static int ileZerowych(int tab[]) {
            int wyn=0;
            for (int i=0; i<tab.length; i++) {
                if (tab[i]==0) {
                    wyn++;
                }
            }
            return wyn;
    }

    public static int ileMaksymalnych(int tab[]) {
        int wyn=0;
        int max=0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i]>max) {
                max=tab[i];
                if (tab[i]==max) {
                    wyn++;
                }
            }
        }
        return wyn;
    }

    public static int sumaDodatnich(int tab[]) {
        int wyn=0;
        int max=0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i]>0) {
                wyn+=tab[i];
            }
        }
        return wyn;
    }


    public static int sumaUjemnych(int tab[]) {

        int wyn=0;
        int max=0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i]<0) {
                wyn+=tab[i];
            }
        }
        return wyn;

    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]) {
        int ciag=0;
        int tymczasowa=0;
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
            return ciag;
        }
        else {
           return tymczasowa;
        }

    }
    public static void signum(int tab[]) {
        System.out.println("Znaki: -1 to liczba ujemna a 1 dodatnia");
        for (int p=0; p<tab.length; p++) {
            if (tab[p]>0) {
                tab[p]=1;
            }
            if (tab[p]<0) {
                tab[p]=-1;
            }
        }
        for (int s=0; s<tab.length; s++) {
            System.out.print(tab[s]+" ");
        }
    }

    public static void main(String[] argc) {
        int[] tablica;
        tablica = new int [10];
        generuj(tablica, 10, -999, 999);
        for (int i=0; i<tablica.length; i++) {
            System.out.print(tablica[i]+" ");
        }
        signum(tablica);
    }
}
