package LAB_05.zad_3;
public class Main {
    public static void main (String[] argc) {
        Adress adress1 = new Adress ("Floriana",2, 7, "Susz", 14240);
        Adress adress2 = new Adress ("Sadowa", 3,51, "Elbląg", 82300);
        Adress adress3 = new Adress ("Lęczycka", 7, 81, "Elbląg", 82300);
        adress1.wyswietl();
        System.out.println();
        adress2.wyswietl();
        System.out.println();
        adress3.wyswietl(); }
}