package LAB_08;
import java.util.ArrayList;
public class zad_2 {
    public static void main(String[] args){
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        x.add(5);
        x.add(6);
        x.add(4);
        x.add(3);
        x.add(852);
        y.add(4);
        y.add(7);
        y.add(2);
        y.add(0);
        y.add(9);
        System.out.println(merge(x,y)); }
    public static ArrayList<Integer> merge(ArrayList<Integer> x,ArrayList<Integer> y) {
        ArrayList<Integer> wynik = new ArrayList<Integer>();
        boolean x_dl = x.size() > y.size() ? true : false;
        int dl = x.size() > y.size() ? x.size() : y.size();
        int kr = dl == x.size() ? y.size() : x.size();
        int i;
        for (i=0; i < kr; i++) {
            wynik.add(x.get(i));
            wynik.add(y.get(i)); }
        for (; i < dl; i++) {
            if (x_dl) {
                wynik.add(x.get(i));
            } else {
                wynik.add(y.get(i)); }
        }
        return wynik; }
}