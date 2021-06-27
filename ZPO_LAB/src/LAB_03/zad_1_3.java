package LAB_03;
public class zad_1_3 {
    public static String repeat (String str, int x) {
        String wynik="";
        for (int j=0; j<x; j++) {
            wynik+=str; }
        return wynik; }
    public static void main (String[] argc) {
        String wynik=" ";
        wynik = repeat("dx ",4);
        System.out.print(wynik); }
}