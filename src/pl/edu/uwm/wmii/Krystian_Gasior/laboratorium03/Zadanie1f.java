package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium03;

import java.lang.Character;
import java.lang.String;


public class Zadanie1f {

    public static String change(String str) {
        String s;
        int rozmiar = str.length();
        String wynik=" ";
        for (int i=0; i<rozmiar; i++) {

            if (Character.isLetter(str.charAt(i))) {

                if ((Character.isUpperCase(str.charAt(i)))) {
                    s = str.substring(i, i + 1);
                    wynik += s.toLowerCase();

                }
                if ((Character.isLowerCase(str.charAt(i)))) {
                    s = str.substring(i, i + 1);
                    wynik += s.toUpperCase();

                }
            }

            else {
                s=str.substring(i, i + 1);;
                wynik+=s;
            }



        }

        return wynik;
    }

    public static void main (String[] argc) {
        String tekst = "Ala ma KotKa";
        String wyn = change(tekst);
        System.out.println(wyn);

    }
}
