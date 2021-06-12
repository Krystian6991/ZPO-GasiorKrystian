package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie3;

public class main {
    public static void main (String[] argc) {
        Adres adres1 = new Adres ("pulaskiego", 18, 44, "Zambrow", 18300);
        Adres adres2 = new Adres ("sienkiewicza", 9, "Wrocław", 93525);
        Adres adres3 = new Adres ("abramczuka", 3, 4, "Sosnowiec", 11297);
        adres1.pokaz();
        System.out.println();
        adres2.pokaz();
        System.out.println();
        adres3.pokaz();
    }
}
