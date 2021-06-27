package LAB_Strategia.zad_4;

public class ModelDuck extends Kaczka {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Jestem zabawką");
    }
}
