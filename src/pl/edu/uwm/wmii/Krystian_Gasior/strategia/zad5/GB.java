package pl.edu.uwm.wmii.Krystian_Gasior.strategia.zad5;

public class GB extends Zamowienie{
    public GB(String towar, double ilosc, double cena){
        super(towar, ilosc, cena * 1.2);
    }
}
