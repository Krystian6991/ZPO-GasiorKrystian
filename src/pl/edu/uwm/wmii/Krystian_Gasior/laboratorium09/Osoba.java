package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium09;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable,Comparable<Osoba>{

    public Osoba(String nazwisko,LocalDate dataUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }
    public String getNazwisko(){
        return this.nazwisko;
    }
    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }
    @Override
    public String toString()
    {
        return "["+this.getClass().getSimpleName()+"]"+"["+this.getNazwisko().toString()+"]"+"["+this.getDataUrodzenia().toString()+"]";
    }
    @Override
    public boolean equals(Object otherObject)
    {
        if(this==otherObject)
            return true;
        if(otherObject==null)
            return false;
        if(getClass()!=otherObject.getClass())
            return false;
        Osoba other = (Osoba) otherObject;
        return this.nazwisko.equals(other.nazwisko) && this.dataUrodzenia == other.dataUrodzenia;
    }
    @Override
    public int compareTo(Osoba o)
    {
        if(this.getNazwisko().compareTo(o.getNazwisko())>0)
            return 1;
        else if(this.getNazwisko().compareTo(o.getNazwisko())<0)
            return -1;
        else return this.getDataUrodzenia().compareTo(o.getDataUrodzenia());
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;
}