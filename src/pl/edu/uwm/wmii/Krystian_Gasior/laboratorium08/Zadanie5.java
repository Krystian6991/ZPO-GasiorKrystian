package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium08;

import java.util.ArrayList;

public class Zadanie5 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        reverse(a);
        System.out.println(a);

    }
    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> wynik = new ArrayList<>();
        for(int i=a.size()-1;i>=0;i--)
        {
            wynik.add(a.get(i));
        }
        a.clear();
        for (int i=0;i<wynik.size();i++)
        {
            a.add(wynik.get(i));
        }
    }
}