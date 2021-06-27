package LAB_04;

public class test {
    public static void main (String[] argc) {
        rachunekBankowy klient1 = new rachunekBankowy(5500);
        rachunekBankowy klient2 = new rachunekBankowy(2600);
        rachunekBankowy.setRocznaStopaProcentowa(0.01);

        klient1.obliczMiesieczneOdsetki();
        System.out.println("Szczędności klienta 1 "+klient1.getSaldo());
        klient2.obliczMiesieczneOdsetki();
        System.out.println("Szczędności klienta 2 "+klient2.getSaldo());
        rachunekBankowy.setRocznaStopaProcentowa(0.09);
        klient1.obliczMiesieczneOdsetki();
        System.out.println("Szczędności klienta 1 "+klient1.getSaldo());
        klient2.obliczMiesieczneOdsetki();
        System.out.println("Szczędności klienta 2 "+klient2.getSaldo()); }
}
