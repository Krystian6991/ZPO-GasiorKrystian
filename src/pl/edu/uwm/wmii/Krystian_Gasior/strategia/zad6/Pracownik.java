package pl.edu.uwm.wmii.Krystian_Gasior.strategia.zad6;

public abstract class Pracownik {
    Dojezdzac dojezdzac;
    Pracowac pracowac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;

    public Pracownik(String zawod) {
        String Zawod = zawod;
    }

    public void jedz() {dojezdzac.dojezdzaj();}

    public  void pracuj() {pracowac.pracuj();}

    public void odpoczywaj() {spedzanieWolnegoCzasu.spedzajWolnyCzas();}
}
