package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestOsoba {
    public static void main (String[] argc) {

        Osoba[] grupa = new Osoba [5];
        grupa[0]=new Osoba("Kowalski", LocalDate.of(2000, 12, 31));
        grupa[1]=new Osoba("Nowak", LocalDate.of(2000, 05, 01));
        grupa[2]=new Osoba("Kowalewska", LocalDate.of(1997, 06, 27));
        grupa[3]=new Osoba("Kowalski", LocalDate.of(1998, 04, 26));
        grupa[4]=new Osoba("Andrzejczuk", LocalDate.of(2000, 05, 01));
        Osoba os = new Osoba("Andrzejczuk", LocalDate.of(2000, 05, 01));
        for (Osoba p : grupa) {
            System.out.println(p.getNazwisko()+" "+p.getDataUrodzenia());
        }
        Arrays.sort(grupa);
        System.out.println(" ");

        Arrays.toString(grupa);
        for (Osoba p : grupa) {
            System.out.println(p.getNazwisko()+" "+p.getDataUrodzenia());
        }
      //  System.out.println(dzis.ileLat(dzis));

    }
}
