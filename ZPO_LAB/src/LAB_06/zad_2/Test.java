package LAB_06.zad_2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Test {
    public static void main(String[] argc) {
        List<Instrument> orkiestra = new ArrayList<>(5);
        orkiestra.add(new Fortepian ("Bosendorfer", LocalDate.of(2020, 07, 13)));
        orkiestra.add(new Skrzypce ("Violin", LocalDate.of(2015, 05, 01)));
        orkiestra.add(new Fortepian ("Artesia", LocalDate.of(2019, 03, 31)));
        orkiestra.add(new Skrzypce ("Wagner", LocalDate.of(2013, 10, 28)));
        orkiestra.add(new Flet ("Trevor James", LocalDate.of(2021, 06, 20)));
        for (Instrument i : orkiestra) {
            System.out.println("Producent: "+i.getProducent()+" Rok produkcji "+i.rokProdukcji.getYear());
            System.out.println(""); }
        for (Instrument j: orkiestra) {
            j.dzwiek(); }
    }}