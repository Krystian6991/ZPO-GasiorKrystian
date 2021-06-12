package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium03;

public class Zadanie1d {

    public static String repeat (String str, int n) {
        String wyn=" ";
        for (int i=0; i<n; i++) {
            wyn+=str;
        }
            return wyn;
    }

    public static void main (String[] argc) {
        String wynik=" ";
        wynik = repeat("ho",8);
        System.out.print(wynik);


    }

}
