package LAB_02;
import java.util.Random;
public class zad_2 {
        public static void generuj(int tablica[], int x, int minimalna, int maksymalna) {
            Random r = new Random();
            for (int i = 0; i < x; i++) {
                tablica[i] = r.nextInt(Math.abs(minimalna)+maksymalna)+maksymalna; }
        }
        public static int ileParzystych(int tablica[]) {
            int parzyste=0;
            for (int i=0; i<tablica.length; i++) {
                if (tablica[i]%2==0) {
                    parzyste++; }
            }
            return parzyste; }
        public static int ileNieparzystych(int tablica[]) {
            int nieparzystych=0;
            for (int i=0; i<tablica.length; i++) {
                if (tablica[i]%2 !=0) {
                    nieparzystych++; }
            }
            return nieparzystych; }
        public static int ileDodatnich(int tablica[]) {
            int dodatnich=0;
            for (int i=0; i<tablica.length; i++) {
                if (tablica[i]>0) {
                    dodatnich++; }
            }
            return dodatnich; }
        public static int ileUjemnych(int tablica[]) {
            int ujemnych = 0;
            for (int i = 0; i < tablica.length; i++) {
                if (tablica[i] < 0) {
                    ujemnych++; }
            }
            return ujemnych; }
        public static int ileZerowych(int tablica[]) {
            int zer=0;
            for (int i=0; i<tablica.length; i++) {
                if (tablica[i]==0) {
                    zer++; }
            }
            return zer; }
        public static int ileMaksymalnych(int tablica[]) {
            int maksymalnych=0;
            int max=0;
            for(int i=0; i<tablica.length; i++) {
                if (tablica[i]>max) {
                    max=tablica[i];
                    if (tablica[i]==max) {
                        maksymalnych++; }
                }
            }
            return maksymalnych; }
        public static int sumaDodatnich(int tablica[]) {
            int dodatnie=0;
            int max=0;
            for(int i=0; i<tablica.length; i++) {
                if (tablica[i]>0) {
                    dodatnie+=tablica[i]; }
            }
            return dodatnie; }
        public static int sumaUjemnych(int tablica[]) {
            int ujemnych=0;
            int max=0;
            for(int i=0; i<tablica.length; i++) {
                if (tablica[i]<0) {
                    ujemnych+=tablica[i]; }
            }
            return ujemnych; }
        public static int dlugoscMaksymalnegoCiaguDodatnich(int tablica[]) {
            int ciag=0;
            int tymczasowa=0;
            for (int t: tablica) {
                if(t>0) {
                    ciag++;
                    if (ciag>tymczasowa) {
                        tymczasowa=ciag; } }
                else {
                    ciag=0; } }
            if (tymczasowa<=ciag) {
                return ciag; }
            else {
                return tymczasowa; }
        }
        public static void signum(int tablica[]) {
            System.out.println("\n Znak: 0 to liczba ujemna a 1 dodatnia");
            for (int p=0; p<tablica.length; p++) {
                if (tablica[p]>0) {
                    tablica[p]=1; }
                if (tablica[p]<0) {
                    tablica[p]=0; } }
            for (int s=0; s<tablica.length; s++) {
                System.out.print(tablica[s]+" "); }
        }
        public static void main(String[] argc) {
            int[] tablica;
            tablica = new int [100];
            generuj(tablica, 100, -999, 999);
            for (int i=0; i<tablica.length; i++) {
                System.out.print(tablica[i]+" "); }
            signum(tablica); }
    }