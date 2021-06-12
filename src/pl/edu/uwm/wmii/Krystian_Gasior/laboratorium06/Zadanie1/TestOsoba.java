package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium06.Zadanie1;

import java.util.*;
import java.time.*;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", "Jan", false,50, LocalDate.of(2000,01,25));
        ludzie[1] = new Student("Nowak", "Małgorzata", true,"informatyka",4.50, LocalDate.of(1990,05,12));


        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + " "+p.getImie()+ " "+p.getPlec()+": " + p.getOpis() + " "+p.getDataUrodzenia());
        }

    }
}

abstract class Osoba
{


    public Osoba(String nazwisko, String imie, Boolean plec, LocalDate data) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.plec = plec;
        this.dataUrodzenia = data;

    }

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
    private LocalDate dataUrodzenia;
}

class Pracownik extends Osoba
{
    public Pracownik(String nazwisko, String imie, Boolean plec, double pobory, LocalDate dataUrodzenia)
    {
        super(nazwisko, imie, plec, dataUrodzenia);
        this.pobory = pobory;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return ("pracownik z pensją "+ pobory);
    }

    private double pobory;
}


class Student extends Osoba
{
    public Student(String nazwisko, String imie, Boolean plec, String kierunek, double sredniaOcen, LocalDate dataUrodzenia)
    {
        super(nazwisko, imie, plec, dataUrodzenia);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek +" średnia ocen: "+ sredniaOcen;
    }

    public double getSredniaOcen(){
        return sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}

