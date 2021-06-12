package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie5;

public class Osoba
    {

    private String nazwisko;
    private int rokUrodzenia;

    public String toString() {
        return nazwisko+" "+rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public Osoba (String nazwisko, int rok_urodzenia) {
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rok_urodzenia;
    }

    }
class Student extends Osoba
{

    private String kierunek;

    public String getKierunek() {
        return kierunek;
    }

    public Student(String nazw, int rok, String kier) {
        super(nazw,rok);
        this.kierunek=kier;
    }
    public String toString() {
        return super.toString()+" "+this.kierunek;
    }
}

class Nauczyciel extends Osoba {

    private int pensja;

    public Nauczyciel(String nazw, int rok, int dolar) {
        super(nazw, rok);
        pensja=dolar;
    }

    public int getPensja()
    {
        return pensja;
    }
    public String toString()
    {
        return super.toString()+" "+this.pensja;
    }
    public static void main(String[] argc)
    {
        Osoba[] ludzie = new Osoba[4];
        ludzie[0] = new Student("Kowalski", 1997, "informatyka");
        ludzie[1] = new Student("DzbanKulpinski", 1998, "niestety_informatyks");
        ludzie[2] = new Nauczyciel("BeKa", 1958, 0);
        ludzie[3] = new Nauczyciel("Niemczyk", 1970, 999999999);
        System.out.println(ludzie[0].toString());
        System.out.println(ludzie[1].toString());
        System.out.println(ludzie[2].toString());
        System.out.println(ludzie[3].toString());
        Nauczyciel n =  new Nauczyciel("Niemczyk", 1970, 999999999);
        n.getPensja();
    }
}
