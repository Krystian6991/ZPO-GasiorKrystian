package LAB_03;
public class zad_1_4 {
    public static int[] where(String str, String subStr) {
        int[] wynik;
        wynik = new int[str.length()];
        int niezerowe = 0;
        for (int i = 0; i < str.length() - subStr.length() + 1; i++) {
            if (str.substring(i, i + subStr.length()).equals(subStr)) {
                wynik[i] = 1; }
        }
        for (int j = 0; j < str.length(); j++) {
            if (wynik[j] == 1) {
                niezerowe++; }
        }
        int[] wynik2;
        wynik2 = new int[niezerowe];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (wynik[i] == 1) {
                wynik2[j] = i;
                j++; }
        }
        return wynik2; }
    public static void main(String[] argc) {
        int[] tab = where("fxjgfdky,vgxdhaersdkhkjfyufytsjxgjfktsaetghkuf", "f");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " "); }
    }
}