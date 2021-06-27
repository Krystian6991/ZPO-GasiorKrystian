package LAB_Strategia.zad_4;

public class RubberDuck extends Kaczka {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("Gumową kaczuszką jestem");
    }
}
