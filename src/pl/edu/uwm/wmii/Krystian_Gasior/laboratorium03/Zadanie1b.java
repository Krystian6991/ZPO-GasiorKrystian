package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium03;

public class Zadanie1b {

    public static int countSubStr(String str, String subStr) {
        int licznik=0;
        for (int i=0; i<str.length()-subStr.length()+1; i++) {
                if (str.substring(i,i+subStr.length()).equals(subStr)) {
                    licznik++;
                }



        }

        return licznik;
    }



    public static void main (String[] args) {

        int wyn=0;
        wyn=countSubStr("ohohtohothotohtohohtohothotohtohoh","ho");
        System.out.println(wyn);


    }
}
