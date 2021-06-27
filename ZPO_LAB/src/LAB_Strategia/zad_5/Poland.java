package LAB_Strategia.zad_5;

public class Poland extends Zamowienie{
    public Poland(String towar, double ilosc, double cena){
        super(towar, ilosc, cena * 1.6);
    }
}
