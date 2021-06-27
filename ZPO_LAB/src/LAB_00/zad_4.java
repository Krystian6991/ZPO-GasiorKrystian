package LAB_00;
public class zad_4 {
    public static void main(String[] arg) {
        double wklad = 10000;
        double oprocentowanie = 0.01;
        for(int i=1;i<=5;i++) {
            wklad+=wklad*oprocentowanie;
            System.out.println(wklad);
        }
    }
}
