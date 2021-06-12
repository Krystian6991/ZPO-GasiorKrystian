package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie6;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle (int wys, int dl, int x, int y) {
        setLocation(x,y);
        setSize(dl,wys);
    }
    public int getArea() {
        return this.height*this.width;
    }
    public int getPerimeter() {
        return 2*this.width+2*this.height;
    }
}
