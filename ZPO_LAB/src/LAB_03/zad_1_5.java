package LAB_03;
public class zad_1_5 {
   public static String change(String str) {
        String x;
        int rozmiar = str.length();
        String rezultat=" ";
        for (int i=0; i<rozmiar; i++) {
            if (Character.isLetter(str.charAt(i))) {
                if ((Character.isUpperCase(str.charAt(i)))) {
                    x = str.substring(i, i + 1);
                    rezultat += x.toLowerCase(); }
                if ((Character.isLowerCase(str.charAt(i)))) {
                    x = str.substring(i, i + 1);
                    rezultat += x.toUpperCase(); }
            }
            else {
                x=str.substring(i, i + 1);;
                rezultat+=x; }
        }
        return rezultat; }
    public static void main (String[] argc) {
        String tekst = "Przychodzisz zawsze do mnie gdy zapada zmrok zapalasz rzekę tęczy i przerywasz noc zapalasz rzekę tęczy i przerywasz noc.";
        String wyn = change(tekst);
        System.out.println(wyn); }
}