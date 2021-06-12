package pl.edu.uwm.wmii.Krystian_Gasior.strategia.zad5;

public class Germany extends Zamowienie {
    public Germany(String towar, double ilosc, double cena){
        super(towar, ilosc, cena * 1.14);
    }
}
