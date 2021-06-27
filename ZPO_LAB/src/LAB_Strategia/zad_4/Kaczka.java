package LAB_Strategia.zad_4;

public abstract class Kaczka {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Kaczka() {
    }
    public void setFlyBehavior (FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
