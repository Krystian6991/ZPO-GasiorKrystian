package LAB_05.zad_5;
public class Persona_V2 {
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
    public Persona_V2 (String nazwisko, int rok_urodzenia) {
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rok_urodzenia; }
}
class Student extends Persona_V2 {
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
class Nauczyciel extends Persona_V2 {
    private int pensja;
    public Nauczyciel(String nazwa, int rok, int euro) {
        super(nazwa, rok);
        pensja=euro; }
    public int getPensja() {
        return pensja; }
    public String toString()
    {
        return super.toString()+" "+this.pensja;
    }
    public static void main(String[] argc) {
    Persona_V2[] ludzie = new Persona_V2[4];
    ludzie[0] = new Student("Andrzejewicz", 1967, "Matematyka");
    ludzie[1] = new Student("Jurgielewicz", 1979, "Informatyka");
    ludzie[2] = new Nauczyciel("Gliszczyński", 1982, 2000);
    ludzie[3] = new Nauczyciel("Kozłowski", 1996, 19453);
    System.out.println(ludzie[0].toString());
    System.out.println(ludzie[1].toString());
    System.out.println(ludzie[2].toString());
    System.out.println(ludzie[3].toString());
    Nauczyciel x =  new Nauczyciel("Kozłowski", 1996, 19453);
    x.getPensja();
    }}