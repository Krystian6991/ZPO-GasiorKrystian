package LAB_Strategia.zad_6;

public class Pracownik {
    Dojezdzac dojezdzac;
    Pracowac pracowac;
    CzasWolny czasWolny;

    public Pracownik(String zawod) {
        String Zawod = zawod;
    }

    public void jedz() {dojezdzac.dojezdzac();}

    public  void pracuj() {pracowac.pracuj();}

    public void odpoczywaj() {czasWolny.czasWolny();}
}
