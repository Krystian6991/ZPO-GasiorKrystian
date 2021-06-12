package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium09;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args){
        ArrayList<Student> lista = new ArrayList<>();
        lista.add(new Student("Kot", LocalDate.of(1997,06,15),4.75));
        lista.add(new Student("Aniszewski",LocalDate.of(1985,10,01),5.0));
        lista.add(new Student("Kot",LocalDate.of(1983,01,11),3.1));
        lista.add(new Student("Walczak",LocalDate.of(2004,04,29),4.0));
        lista.add(new Student("Chabior",LocalDate.of(2000,07,07),3.75));
        System.out.println(lista.toString());
        lista.sort(Student::compareTo);
        System.out.println(lista.toString());
    }
}