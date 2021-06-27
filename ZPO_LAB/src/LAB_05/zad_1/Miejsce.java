package LAB_05.zad_1;
public class Miejsce {
    Miejsce(int a, int b)
    { this.a = a;
        this.b = b; }
    public void show()
    {
        System.out.println("<" + a + ", " + b + ">");
    }
    public int a()
    {
        return a;
    }
    public int b()
    {
        return b;
    }
    private int a, b;
}