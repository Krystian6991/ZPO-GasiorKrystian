package pl.edu.uwm.wmii.Krystian_Gasior.metodaszablonowa;

public class PizzaSiciliana extends Pizza {
    @Override
    public void make() {
        setDough("Thin");
        setSauce("Tomato");
        addMozarellaCheese();
        addMozarellaCheese();
        addOliveOilAndBasil();
        try {
            bake(15);
        } catch (InterruptedException e) {
            System.out.println("Your pizza cannot be baked.");
        }

    }
}
