package LAB_06.zad_1;
import java.time.LocalDate;
public class Test {
    public static void main(String[] args)
    { Persona[] ludzie = new Persona[2];
        ludzie[0] = new Pracownik("Grzegorzyca", "Waldemar", false,4250, LocalDate.of(1998,07,12));
        ludzie[1] = new Student("Lubiszewska", "Kasia", true,"Matematyka",3.80, LocalDate.of(1996,02,29));
        for (Persona p : ludzie) {
            System.out.println(p.getNazwisko() + " "+p.getImie()+ " "+p.getPlec()+": " + p.getOpis() + " "+p.getDataUrodzenia()); }
    }}
abstract class Persona
{ public Persona(String nazwisko, String imie, Boolean plec, LocalDate data) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.plec = plec;
        this.dataUrodzenia = data; }
    public abstract String getOpis();
    public String getNazwisko() {
        return nazwisko;
    }
    public String getImie() {
        return imie;
    }
    public Boolean getPlec() {
        return plec;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    private String nazwisko;
    private String imie;
    private Boolean plec;
    private LocalDate dataUrodzenia;}
class Pracownik extends Persona
{ public Pracownik(String nazwisko, String imie, Boolean plec, double pobory, LocalDate dataUrodzenia)
    { super(nazwisko, imie, plec, dataUrodzenia);
        this.pobory = pobory; }
    public double getPobory()
    {
        return pobory;
    }
    public String getOpis()
    {
        return ("Pensja: "+ pobory);
    }
    private double pobory;}
class Student extends Persona
{ public Student(String nazwisko, String imie, Boolean plec, String kierunek, double sredniaOcen, LocalDate dataUrodzenia)
    { super(nazwisko, imie, plec, dataUrodzenia);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen; }
    public String getOpis()
    {
        return "Studia: " + kierunek +" Ocena średnia: "+ sredniaOcen;
    }
    public double getSredniaOcen(){
        return sredniaOcen;
    }
    private String kierunek;
    private double sredniaOcen;}