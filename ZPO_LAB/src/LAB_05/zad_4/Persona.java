package LAB_05.zad_4;
public class Persona {
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
    public Persona (String nazwisko, int rok_urodzenia) {
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rok_urodzenia; }
}
class Student extends Persona {
    private String kierunek;
    public String getKierunek() {
        return kierunek;
    }
    public Student(String nazwa, int rok, String kierunek) {
        super(nazwa,rok);
        this.kierunek=kierunek; }
    public String toString() {
        return super.toString()+" "+this.kierunek;
    }
}
class Nauczyciel extends Persona {
    private int pensja;
    public Nauczyciel(String nazwa, int rok, int euro) {
        super(nazwa, rok);
        pensja=euro; }
    public int getPensja() {
        return pensja;
    }
    public String toString() {
        return super.toString()+" "+this.pensja;
    }
}