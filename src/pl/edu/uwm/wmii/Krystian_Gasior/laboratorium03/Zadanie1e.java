package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium03;

public class Zadanie1e {

    public static int[] where (String str, String subStr) {
        int[] wyn;
        wyn = new int[str.length()];
        int niezer=0;

            for (int i=0; i<str.length()-subStr.length()+1; i++) {
                if (str.substring(i,i+subStr.length()).equals(subStr)) {
                    wyn[i]=1;
                }

            }
            for (int j=0; j<str.length(); j++) {
                if (wyn[j]==1) {
                    niezer++;
                }
            }
            int[] wyn2;
            wyn2 = new int [niezer];

            int j=0;
            for (int i=0; i<str.length(); i++) {
                if (wyn[i]==1) {
                    wyn2[j]=i;
                    j++;

                }
            }


            return wyn2;


    }

    public static void main (String[] argc) {

            int[] tab=where("alalalalalalalallalala", "ala");
            for (int i=0; i<tab.length; i++) {
              System.out.print(tab[i]+" ");
          }

}}
