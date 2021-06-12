package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie4;

public class Osoba {

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
class Student extends Osoba {

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

    public int getPensja() {
        return pensja;
    }
    public String toString() {
        return super.toString()+" "+this.pensja;
    }
}
