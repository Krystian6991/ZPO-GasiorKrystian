package pl.edu.uwm.wmii.Krystian_Gasior.strategia.zad3;

public abstract class CarSpeed {
    public CarSpeed(){
    }
    abstract int GetMaxSpeed();

    public static void main(String[] args)
    {
        CarSpeed maluch = new Maluch();

        int a = maluch.GetMaxSpeed();
        System.out.println(a);
    }
}