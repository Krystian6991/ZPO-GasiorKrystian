package LAB_Szablonowa;

public class Margaritta extends Pizza {
    public void make() {
        setCiasto("Cienkie");
        setSos("Pomidorowy na ostro");
        DoprawOliwaBazylia();
        DodajExtraSer();
        try {
            Piecz(15);
        } catch (InterruptedException x) {
            System.out.println("Twoja pizza się spaliła");
        }
    }
}