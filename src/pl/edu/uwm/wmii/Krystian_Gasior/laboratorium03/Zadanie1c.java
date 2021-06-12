package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium03;

public class Zadanie1c {

    public static String middle (String str) {
        String wynik=" ";
        for (int i=0; i<str.length(); i++) {
            if (str.length()%2==1 ) {
                wynik = str.substring(str.length()/2,str.length()/2+1);
            }
            else {
                wynik = str.substring(str.length()/2-1,str.length()/2+1);
            }
        }

        return wynik;
    }

    public static void main (String[] argc) {
        String wynik=" ";
        wynik = middle("Jasiorek");
        System.out.print(wynik);


    }

}
