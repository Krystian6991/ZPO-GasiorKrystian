package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium04;

public class TestRachunekBankowy {
    public static void main (String[] argc) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);

        saver1.obliczMiesieczneOdsetki();
        System.out.println("Wartosc 1 "+saver1.getSaldo());
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Wartosc 2 "+saver2.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        System.out.println("Wartosc 1 "+saver1.getSaldo());
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Wartosc 2 "+saver2.getSaldo());



    }
}
