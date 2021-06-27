package LAB_08;
import java.util.ArrayList;
public class zad_1 {
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        x.add(5);
        x.add(6);
        x.add(4);
        x.add(3);
        y.add(4);
        y.add(7);
        y.add(2);
        y.add(0);
        y.add(9);
        System.out.println(append(x,y)); }
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        for(int i=0;i<a.size();i++)
        {
            wynik.add(a.get(i)); }
        for(int j=0;j<b.size();j++)
        {
            wynik.add(b.get(j)); }
        return wynik; }
}