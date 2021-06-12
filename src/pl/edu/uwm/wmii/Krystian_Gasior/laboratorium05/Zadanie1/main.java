package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie1;

public class main {
    public static void main(String[] argc) {
        {
            NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
            a.show();

            Punkt b = new Punkt(3, 5);
            b.show();

            Punkt c = new NazwanyPunkt(3, 6, "tawerna");
            c.show();

            //a = b;               //  --- powoduje błąd kompilacji  (dlaczego ?)
            //a = (NazwanyPunkt) b;  //   --- powoduje błąd wykonania   (dlaczego ?)

            // a = c;                 //--- powoduje błąd kompilacji  (dlaczego ?)
            a = (NazwanyPunkt) c;
            a.show();
        }
    }
}
