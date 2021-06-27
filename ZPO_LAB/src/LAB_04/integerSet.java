package LAB_04;
public class integerSet {
    boolean tablica1[] = new boolean[1000];
    boolean tablica2[] = new boolean[1000];
    public void integerSet() {
        for (int i = 0; i < 100; i++) {
            tablica1[i]=false;
            tablica2[i]=false; }
    }
    public void union(){
        for (int i=0; i<1000; i++) {
            if(tablica1[i]==false&&tablica2[i]==false) {
                System.out.println("FALSE"); }
            else {
                System.out.println("TRUE"); }
        }
    }
    public void intersection(){
        for (int i=0; i<1000; i++) {
            if(tablica1[i]==true&&tablica2[i]==true) {
                System.out.println("TRUE"); }
            else {
                System.out.println("FALSE"); }
        }
    }
}
