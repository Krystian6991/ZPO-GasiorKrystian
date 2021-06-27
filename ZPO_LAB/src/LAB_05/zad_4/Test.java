package LAB_05.zad_4;
public class Test {
    public static void main(String[] argc) {
        Persona[] ludzie = new Persona[4];
        ludzie[0] = new Student("Andrzejewicz", 1967, "Matematyka");
        ludzie[1] = new Student("Jurgielewicz", 1979, "Informatyka");
        ludzie[2] = new Nauczyciel("Gliszczyński", 1982, 2000);
        ludzie[3] = new Nauczyciel("Kozłowski", 1996, 19453);
        System.out.println(ludzie[0].toString());
        System.out.println(ludzie[1].toString());
        System.out.println(ludzie[2].toString());
        System.out.println(ludzie[3].toString());
        Nauczyciel n =  new Nauczyciel("Kozłowski", 1996, 19453);
        n.getPensja(); }
}
