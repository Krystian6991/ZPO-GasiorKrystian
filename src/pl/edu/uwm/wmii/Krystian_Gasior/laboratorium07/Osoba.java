package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium07;

import java.time.LocalDate;

public class Osoba implements Comparable<Osoba> {

    private String nazwisko;
    private LocalDate dataUrodzenia;
    private LocalDate dzis;


    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String toString() {
        return this.getClass().toString()+" ["+this.getNazwisko().toString()+ "] " + this.getDataUrodzenia().toString();
    }

    public boolean equals (Osoba os) {
        if (os.getNazwisko()==this.getNazwisko() && os.getDataUrodzenia()==this.getDataUrodzenia()) {
                return true;
            }
            return false;
        }

    public int compareTo (Osoba other) {
        if (this.nazwisko.compareTo(other.nazwisko)>0) {
            return 1;

        }
        else if (this.nazwisko.compareTo(other.nazwisko)<0) {
                return -1;
            }
        else {

        return this.dataUrodzenia.compareTo(other.dataUrodzenia);
        }


}
    public int ileLat(LocalDate other){
        int wynik;
        wynik = dzis.getYear() - other.getYear();
        return wynik;
    }

}


