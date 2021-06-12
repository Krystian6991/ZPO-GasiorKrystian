package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium08;

import java.util.ArrayList;

public class Zadanie2 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(merge(a,b));

    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a,ArrayList<Integer> b) {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        boolean a_dluzsza = a.size() > b.size() ? true : false;
        int dluzsza = a.size() > b.size() ? a.size() : b.size();
        int krotsza = dluzsza == a.size() ? b.size() : a.size();
        int i;

        for (i=0; i < krotsza; i++) {
            wynik.add(a.get(i));
            wynik.add(b.get(i));
        }
        for (; i < dluzsza; i++) {
            if (a_dluzsza) {
                wynik.add(a.get(i));
            } else {
                wynik.add(b.get(i));
            }
        }
        return wynik;
    }

}
