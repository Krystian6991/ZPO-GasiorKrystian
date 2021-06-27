package LAB_07;
import java.time.LocalDate;
import java.util.Arrays;
public class Test {
    public static void main (String[] argc) {
        Persona[] zbiur = new Persona [5];
        zbiur[0]=new Persona("Antochowski", LocalDate.of(2001, 01, 06));
        zbiur[1]=new Persona("Brzęczyszczykiewicz", LocalDate.of(2005, 10, 15));
        zbiur[2]=new Persona("Jaworski", LocalDate.of(2004, 02, 29));
        zbiur[3]=new Persona("Mędrzycka", LocalDate.of(2000, 02, 29));
        zbiur[4]=new Persona("Strogonov", LocalDate.of(1999, 04, 10));
        Persona pr = new Persona("Strogonov", LocalDate.of(1999, 04, 10));
        for (Persona q : zbiur) {
            System.out.println(q.getNazwisko()+""+q.getDataUrodzenia()); }
        Arrays.sort(zbiur);
        System.out.println(" ");
        Arrays.toString(zbiur);
        for (Persona q : zbiur) {
            System.out.println(q.getNazwisko()+""+q.getDataUrodzenia()); }
    }}