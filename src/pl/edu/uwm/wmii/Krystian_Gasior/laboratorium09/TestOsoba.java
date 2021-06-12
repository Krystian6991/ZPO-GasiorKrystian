package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium09;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Kowalski",LocalDate.of(2004,03,11)));
        grupa.add(new Osoba("Nowak",LocalDate.of(1993,04,25)));
        grupa.add(new Osoba("Kowalski",LocalDate.of(1995,9,23)));
        grupa.add(new Osoba("Cebulak",LocalDate.of(1979,10,11)));
        grupa.add(new Osoba("Wałek",LocalDate.of(2001,10,20)));
        System.out.println(grupa.toString());
        grupa.sort(Osoba::compareTo);
        System.out.println(grupa.toString());

    }
}