package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium00;

public class Zadanie4 {
    public static void main(String[] arg) {
        double kwota = 1000;
        double procent = 0.06;
        for(int i=1;i<=3;i++) {
            kwota+=kwota*procent;
            System.out.println(kwota);
        }
    }
}
