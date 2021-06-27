package LAB_03;
public class zad_1_6 {
    public static String nice(String str) {
        String rezultat=" ";
        int wielkosc=str.length();
        if (wielkosc%3==0) {
            for (int i=1; i<=wielkosc; i++) {
                if (i%3==0) {
                    rezultat+=","; }
                else {
                    rezultat+=str.charAt(i); }
            }
        }
        return rezultat; }
    public static void main (String[] argc) {
        String wynik="";
        String x="112365548632";
        wynik=nice(x);
        System.out.println(wynik); }
}