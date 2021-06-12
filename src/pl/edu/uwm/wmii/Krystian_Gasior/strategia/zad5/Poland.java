package pl.edu.uwm.wmii.Krystian_Gasior.strategia.zad5;

public class Poland extends Zamowienie{
    public Poland(String towar, double ilosc, double cena){
        super(towar, ilosc, cena * 1.23);
    }
}
