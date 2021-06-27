package LAB_Strategia.zad_5;

public class Germany extends Zamowienie {
    public Germany(String towar, double ilosc, double cena){
        super(towar, ilosc, cena * 2.45);
    }
}
