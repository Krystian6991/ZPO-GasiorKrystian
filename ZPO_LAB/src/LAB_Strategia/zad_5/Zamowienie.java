package LAB_Strategia.zad_5;
public abstract class Zamowienie {
    public Zamowienie(String towar, double ilosc, double cena) {
        this.Towar = towar;
        this.Ilosc = ilosc;
        this.Cena = cena; }
    private String Towar;
    private double Ilosc;
    private double Cena;
    public String getTowar(){ return Towar; }
    public double getIlosc(){ return Ilosc; }
    public double getCena(){ return Cena; }
    public static void main(String[] args) {
        Zamowienie zam1 = new Poland("Czereśnie", 100, 22);
        Zamowienie zam2 = new Germany("Szparagi", 100, 42);
        Zamowienie zam3 = new GreatBritain("Baranina",100, 38);
        System.out.println("do Polski: " + zam1.getTowar() + ", Ilość: " + zam1.getIlosc() + ", Cena: " + zam1.getCena());
        System.out.println("do Niemiec: " + zam2.getTowar() + ", Ilość: " + zam2.getIlosc() + ", Cena: " + zam2.getCena());
        System.out.println("do Wielkiej Brytanii: " + zam3.getTowar() + ", Ilość: " + zam2.getIlosc() + ", Cena: " + zam3.getCena());
    }
}
