package LAB_Strategia.zad_3;

public abstract class CarSpeed {
    public CarSpeed(){
    }
    abstract int GetMaxSpeed();

    public static void main(String[] args)
    {
        CarSpeed maluch = new Maluch();
        CarSpeed Ford = new Ford();
        CarSpeed Porshe = new Porshe();
        int a = maluch.GetMaxSpeed();
        int b = Ford.GetMaxSpeed();
        int c = Porshe.GetMaxSpeed();
        System.out.println("Maluch max prędkość: " +a+'\n'+
        "Ford max prędkość: "+b+ '\n'+
         "Porshe max prędkość: "+c+ '\n');
    }
}
