package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie4;

public class TestOsoba {
    public static void main(String[] argc) {
        Osoba[] ludzie = new Osoba[4];
        ludzie[0] = new Student("Kowalski", 1997, "informatyka");
        ludzie[1] = new Student("DzbanKulpinski", 1998, "niestety_informatyks");
        ludzie[2] = new Nauczyciel("BeKa", 1958, 0);
        ludzie[3] = new Nauczyciel("Niemczyk", 1970, 999999999);
        System.out.println(ludzie[0].toString());
        System.out.println(ludzie[1].toString());
        System.out.println(ludzie[2].toString());
        System.out.println(ludzie[3].toString());
        Nauczyciel n =  new Nauczyciel("Niemczyk", 1970, 999999999);
        n.getPensja();
    }
}
