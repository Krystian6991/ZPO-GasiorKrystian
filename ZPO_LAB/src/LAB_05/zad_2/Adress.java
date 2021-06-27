package LAB_05.zad_2;
public class Adress {
    private String ulica, miasto;
    private int numer_domu, numer_mieszkania, kod_pocztowy;
    public Adress(String ul1, int nrdomu1, int nrmieszkania1, String miasto1, int kod_pocztowy1) {
        ulica = ul1;
        numer_domu = nrdomu1;
        numer_mieszkania = nrmieszkania1;
        miasto = miasto1;
        kod_pocztowy = kod_pocztowy1;
    }
    public Adress(String ul1, int nrdomu1, String miasto1, int kod_pocztowy1) {
        ulica = ul1;
        numer_domu = nrdomu1;
        miasto = miasto1;
        kod_pocztowy = kod_pocztowy1;
    }
    boolean publicboolean(Adress x) {
        if (this.kod_pocztowy<x.kod_pocztowy)
            return true;
        else
            return false; }
    void pokaz() {
        if (this.numer_mieszkania==0) {
            System.out.println(kod_pocztowy + "" + miasto);
            System.out.println(ulica + "" + numer_domu);
        }
        else {
            System.out.println(kod_pocztowy + "" + miasto);
            System.out.println(ulica + "" + numer_domu + "" + numer_mieszkania); }}
    public static void main(String[] argc) {
        Adress adres1 = new Adress("Floriana", 2, 7, "Susz", 14240);
        Adress adres2 = new Adress("Sadowa", 3,51, "Elbląg", 82300);
        Adress adres3 = new Adress("Lęczycka", 7, 82, "Elbląg", 82300);
        adres1.pokaz();
        System.out.println();
        adres2.pokaz();
        System.out.println();
        adres3.pokaz();
        System.out.println(adres1.publicboolean(adres2)); }
}