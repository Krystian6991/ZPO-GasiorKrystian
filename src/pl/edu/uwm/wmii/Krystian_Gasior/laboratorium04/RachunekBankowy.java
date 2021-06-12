package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium04;

public class RachunekBankowy {
    public RachunekBankowy(double s) {
        this.saldo=s;
    }
    public void obliczMiesieczneOdsetki() {
        double odsetki;
        odsetki=(saldo*rocznaStopaProcentowa)/12;
        this.saldo+=odsetki;
    }
    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa){
        RachunekBankowy.rocznaStopaProcentowa=rocznaStopaProcentowa;
    }

    public static double getRocznaStopaProcentowa() {
        return rocznaStopaProcentowa;
    }

    public double getSaldo() {
        return saldo;
    }
    private static double rocznaStopaProcentowa;
    private double saldo;

}

