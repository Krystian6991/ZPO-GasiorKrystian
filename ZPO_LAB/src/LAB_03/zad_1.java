package LAB_03;
public class zad_1 {
    public static int countChar(String str, char x) {
        int ilosc=0;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i)==x) {
                ilosc++; }
        }
        return ilosc; }
    public static void main (String[] args) {
        String slowo = "konstantyneapolitanczkowneczka";
        char y ='x';
        int ile=0;
        ile = countChar(slowo, y);
        System.out.println(ile);
    }
}