package LAB_Strategia.zad_4;

public class KaczyManiak extends Kaczka {
    public KaczyManiak() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("KACZY MANIAK!!!");
    }
}
