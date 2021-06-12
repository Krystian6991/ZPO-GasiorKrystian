package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium09;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable,Comparable<Osoba> {

    public Student(String nazwisko, LocalDate dataUrodzenia,double sredniaOcen)
    {
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen=sredniaOcen;
    }
    public double getSredniaOcen()
    {
        return this.sredniaOcen;
    }
    @Override
    public String toString()
    {
        return super.toString()+",["+this.sredniaOcen+"]";
    }
    public int compareTo(Student o){
        int wynik = super.compareTo(o);
        if(wynik!=0)
        {
            return wynik;
        }
        else
        {
            return new Double(this.getSredniaOcen()).compareTo(new Double(o.getSredniaOcen()));
        }
    }

    private double sredniaOcen;
}