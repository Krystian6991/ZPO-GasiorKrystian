package LAB_07;
import java.time.LocalDate;
public class Persona {
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private LocalDate dzis;
    public Persona(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia; }
    public String getNazwisko() {
        return nazwisko;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    public String toString() {
        return this.getClass().toString()+" ["+this.getNazwisko().toString()+ "]" + this.getDataUrodzenia().toString(); }
    public boolean equals (Persona pr) {
        if (pr.getNazwisko()==this.getNazwisko() && pr.getDataUrodzenia()==this.getDataUrodzenia()) {
            return true; }
        return false; }
    public int compareTo (Persona other) {
        if (this.nazwisko.compareTo(other.nazwisko)>0) {
            return 1; }
        else if (this.nazwisko.compareTo(other.nazwisko)<0) {
            return -1; }
        else {
            return this.dataUrodzenia.compareTo(other.dataUrodzenia); }
    }}