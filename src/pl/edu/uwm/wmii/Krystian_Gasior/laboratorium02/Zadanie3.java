package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium02;
import java.util.Random;

public class Zadanie3 {

        public static void generuj(int tab[], int ile) {
            Random r = new Random();
            for (int i = 0; i < ile; i++) {
                tab[i] = r.nextInt(9)+1;
            }
        }

        public static void main (String[] argc) {

    }
}
