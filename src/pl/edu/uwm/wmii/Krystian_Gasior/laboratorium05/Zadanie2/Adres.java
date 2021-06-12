package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie2;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private int kod_pocztowy;

    public Adres(String ulica1, int numer_domu1, int numer_mieszkania1, String miasto1, int kod_pocztowy1) {
        ulica = ulica1;
        numer_domu = numer_domu1;
        numer_mieszkania = numer_mieszkania1;
        miasto = miasto1;
        kod_pocztowy = kod_pocztowy1;
    }

    public Adres(String ulica1, int numer_domu1, String miasto1, int kod_pocztowy1) {
        ulica = ulica1;
        numer_domu = numer_domu1;
        miasto = miasto1;
        kod_pocztowy = kod_pocztowy1;
    }

     boolean publicboolean(Adres x) {
         if (this.kod_pocztowy<x.kod_pocztowy)
            return true;
         else
             return false;
     }

    void pokaz() {
        if (this.numer_mieszkania==0) {
            System.out.println(kod_pocztowy + " " + miasto);
            System.out.println(ulica + " " + numer_domu);
        }
        else {
        System.out.println(kod_pocztowy + " " + miasto);
        System.out.println(ulica + " " + numer_domu + " " + numer_mieszkania);
    }}

        public static void main(String[] argc) {
            Adres adres1 = new Adres("pulaskiego", 18, 44, "Zambrow", 18300);
            Adres adres2 = new Adres("sienkiewicza", 9, "Wrocław", 93525);
            Adres adres3 = new Adres("abramczuka", 3, 4, "Sosnowiec", 11297);
            adres1.pokaz();
            System.out.println();
            adres2.pokaz();
            System.out.println();
            adres3.pokaz();
            System.out.println(adres1.publicboolean(adres2));
        }
    }

