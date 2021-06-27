package LAB_04;
public class rachunekBankowy {
    public rachunekBankowy(double s) {
        this.saldo=s;
    }
    public void obliczMiesieczneOdsetki() {
        double odsetki;
        odsetki=(saldo*rocznaStopaProcentowa)/12;
        this.saldo+=odsetki; }
    public static void setRocznaStopaProcentowa(double rocznaStopaProcentowa){
        rachunekBankowy.rocznaStopaProcentowa=rocznaStopaProcentowa; }
    public static double getRocznaStopaProcentowa() {
        return rocznaStopaProcentowa;
    }
    public double getSaldo() {
        return saldo;
    }
    private static double rocznaStopaProcentowa;
    private double saldo;
}