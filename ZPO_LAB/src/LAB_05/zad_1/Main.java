package LAB_05.zad_1;
public class Main {
    public static void main(String[] argc) {
        { MojPunkt x = new MojPunkt(5, 8, "zajazd");
            x.show();
            Miejsce y = new Miejsce(5, 8);
            y.show();
            Miejsce z = new MojPunkt(5, 7, "gospoda");
            z.show();
            x = (MojPunkt) z;
            x.show(); }
    }
}