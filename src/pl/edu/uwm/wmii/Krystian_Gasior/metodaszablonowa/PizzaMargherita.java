package pl.edu.uwm.wmii.Krystian_Gasior.metodaszablonowa;

public class PizzaMargherita extends Pizza {
    public void make() {
        setDough("Thick");
        setSauce("Tomato");
        addOlivesAndCapers();
        addSeasonings();
        try {
            bake(15);
        } catch (InterruptedException e) {
            System.out.println("Your pizza cannot be baked.");
        }

    }
}
