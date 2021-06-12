package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium03;
import java.lang.StringBuffer;

public class Zadanie1g {

    public static String nice(String str) {
        String wynik=" ";
        int rozmiar=str.length();
        if (rozmiar%3==0) {
            for (int i=1; i<=rozmiar; i++) {
                if (i%4==0) {
                    wynik+="'";
                }
                else {
                    wynik+=str.charAt(i);
                }
            }
        }

        return wynik;
    }

    public static void main (String[] argc) {
        String wyn="";
        String liczba="100000";
        wyn=nice(liczba);
        System.out.println(wyn);

    }
}
