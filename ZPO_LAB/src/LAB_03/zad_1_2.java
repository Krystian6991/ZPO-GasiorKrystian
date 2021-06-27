package LAB_03;
public class zad_1_2 {
    public static String middle (String str) {
        String mediana="";
        for (int j=0; j<str.length(); j++) {
            if (str.length()%2 == 1 ) {
                mediana = str.substring(str.length()/2,str.length()/2+1); }
            else {
                mediana = str.substring(str.length()/2-1,str.length()/2+1); }
        }
        return mediana; }
    public static void main (String[] argc) {
        String mediana=" ";
        mediana = middle("konstantyneapolitanczkowneczka");
        System.out.print(mediana); }
}
