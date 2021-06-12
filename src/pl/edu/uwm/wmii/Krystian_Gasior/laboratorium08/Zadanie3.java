package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium08;

import java.util.ArrayList;

public class Zadanie3 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(mergeSorted(a,b));

    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,ArrayList<Integer> b) {
        ArrayList<Integer> wynik = new ArrayList<>();
        int i;
        int j;
        for (i = 0, j = 0; i < a.size(); i++) {
            for (int k = j; k < b.size(); k++) {
                if (a.get(i) >= b.get(k)) {
                    wynik.add(b.get(k));
                    j++;
                }
            }
            wynik.add(a.get(i));
        }
        for (; j < b.size(); j++)
            wynik.add(b.get(j));
        return wynik;
    }
}
