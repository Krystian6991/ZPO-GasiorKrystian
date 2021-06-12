package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium03;
import java.lang.String;

public class Zadanie1a {
    public static int countChar(String str, char c) {
        int wynik=0;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i)==c) {
                wynik++;
            }
        }
        return wynik;
    }



    public static void main (String[] args) {
         String wyraz = "ciocia";
         char w='c';
         int wyn=0;
         wyn = countChar(wyraz, w);
         System.out.println(wyn);

    }
}
