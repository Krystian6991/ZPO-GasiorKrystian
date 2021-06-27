package LAB_08;
import java.util.ArrayList;
public class zad_5 {
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(546);
        x.add(676);
        x.add(445);
        x.add(356);
        x.add(568);
        reverse(x);
        System.out.println(x);}
    public static void reverse(ArrayList<Integer> x){
        ArrayList<Integer> rezultat = new ArrayList<>();
        for(int i=x.size()-1;i>=0;i--)
        {
            rezultat.add(x.get(i)); }
        x.clear();
        for (int i=0;i<rezultat.size();i++)
        {
            x.add(rezultat.get(i)); }
    }}