package LAB_Szablonowa;

public class Sycylijska extends Pizza {
    public void make() {
        setCiasto("Grube");
        setSos("Pomidorowy na ostro");
        DodajOliwki_Kapary();
        DoprawOliwaBazylia();
        try {
            Piecz(15);
        } catch (InterruptedException x) {
            System.out.println("Twoja pizza się spaliła");
        }
    }
}
