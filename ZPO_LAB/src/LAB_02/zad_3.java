package LAB_02;
import java.util.Random;
public class zad_3 {
    public static void generuj(int tablica[], int ilosc) {
        Random r = new Random();
        for (int i = 0; i < ilosc; i++) {
            tablica[i] = r.nextInt(9)+1; }
    }
    public static void main (String[] argc) {
    }
}
