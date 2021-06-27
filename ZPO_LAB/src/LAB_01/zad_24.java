package LAB_01;
import java.util.Scanner;
public class zad_24 {
    public static void main(String[] args) {
        System.out.println("Podaj ilość: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int minimalna = 0;
        int maksymalna = 0;
        for (int i = 0; i < x; i++) {
            System.out.println("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            int y = in1.nextInt();
            if (i == 0) {
                minimalna = y;
                maksymalna = y; }
            else {
                if (y > maksymalna) {
                    maksymalna = y; }
                if (y < minimalna) {
                    minimalna = y; }
            }
        }
        System.out.println("Minimum:" + minimalna + '\n' + "Maksimum:" + maksymalna);
    }
}