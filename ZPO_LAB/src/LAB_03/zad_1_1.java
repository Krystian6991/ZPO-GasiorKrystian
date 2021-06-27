package LAB_03;
public class zad_1_1 {
    public static int countSubStr(String str, String subStr) {
        int ilosc=0;
        for (int j=0; j<str.length()-subStr.length()+1; j++) {
            if (str.substring(j,j+subStr.length()).equals(subStr)) {
                ilosc++; }
        }
        return ilosc; }
    public static void main (String[] args) {
        int wynik=0;
        wynik=countSubStr("saFDSGSADGASGWAFDSFGSDafdsgrasgsdagasdgsgregsdfgsadgdsg","s");
        System.out.println(wynik); }
}