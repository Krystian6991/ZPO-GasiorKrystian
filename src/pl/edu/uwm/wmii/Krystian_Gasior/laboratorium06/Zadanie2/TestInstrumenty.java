package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium06.Zadanie2;

import java.time.LocalDate;
import java.util.*;


public class TestInstrumenty {
    public static void main(String[] argc) {
        List<Instrument> orkiestra = new ArrayList<>(5);
        orkiestra.add(new Flet ("Yamaha", LocalDate.of(2012, 02, 12)));
        orkiestra.add(new Fortepian ("Klawisze", LocalDate.of(2008, 02, 12)));
        orkiestra.add(new Skrzypce ("Stradivarius", LocalDate.of(1993, 02, 12)));
        orkiestra.add(new Flet ("AAA", LocalDate.of(2009, 02, 12)));
        orkiestra.add(new Fortepian ("Tak", LocalDate.of(2001, 02, 12)));

        for (Instrument i : orkiestra) {
            System.out.println("Producent: "+i.getProducent()+" Rok produkcji "+i.rokProdukcji.getYear());
            System.out.println(" ");
        }

        for (Instrument j: orkiestra) {
            j.dzwiek();
        }

    }
}
