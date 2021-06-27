package LAB_05.zad_1;
public class MojPunkt extends Miejsce {
    MojPunkt(int a, int b, String nazwa)
    { super(a , b);
        this.nazwa = nazwa; }
    public void show()
    {
        System.out.println(nazwa + ":<" + a() + ", " + b() + ">");
    }
    private String nazwa;
}