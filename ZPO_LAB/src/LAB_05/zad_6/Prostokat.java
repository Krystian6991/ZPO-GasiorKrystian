package LAB_05.zad_6;
import java.awt.Rectangle;
public class Prostokat extends Rectangle  {
    public Prostokat (int wysokosc, int dlugosc, int a, int b) {
        setLocation(a,b);
        setSize(dlugosc,wysokosc); }
    public int getArea() {
        return this.height*this.width;
    }
    public int getPerimeter() {
        return this.width+this.height; }
}