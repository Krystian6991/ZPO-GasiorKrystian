package LAB_08;
import java.util.ArrayList;
public class zad_4 {
    public static void main(String[] args){
    ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(546);
        x.add(676);
        x.add(445);
        x.add(356);
        x.add(568);
        System.out.println(reversed(x));}
    public static ArrayList<Integer> reversed(ArrayList<Integer>a){
        ArrayList<Integer> rezultat = new ArrayList<Integer>();
        for(int i=a.size()-1;i>=0;i--)
        {
            rezultat.add(a.get(i));
        }
        return rezultat; }
}