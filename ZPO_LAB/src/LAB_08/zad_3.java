package LAB_08;
import java.util.ArrayList;
public class zad_3 {
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
        System.out.println(mergeSorted(x,y)); }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> x,ArrayList<Integer> y) {
        ArrayList<Integer> wynik = new ArrayList<>();
        int i;
        int j;
        for (i = 0, j = 0; i < x.size(); i++) {
            for (int k = j; k < y.size(); k++) {
                if (x.get(i) >= y.get(k)) {
                    wynik.add(y.get(k));
                    j++; }
            }
            wynik.add(x.get(i)); }
        for (; j < y.size(); j++)
            wynik.add(x.get(j));
        return wynik; }
}