package LAB_Szablonowa;
abstract class Pizza {
    public abstract void make();
    public void setCiasto(String TypCiasta) {
        try {
            Thread.sleep(1000);
            System.out.println(TypCiasta+" Ciasto wybrane: ");
        } catch (InterruptedException x) {
            System.out.println("Ciasto nie wyszło - smutne pepe");
        }
    }
    public void setSos(String sos) {
        try {
            Thread.sleep(1000);
            System.out.println(sos+ " Wybrano sos: ");
        } catch (InterruptedException x) {
            System.out.println("Sos się wylał na podłoge :(");
        }
    }
    public void Piecz(int czas_min) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Pieczenie!");
        for(int i=czas_min; i>0; i--) {
            System.out.print(i+"... ");
            Thread.sleep(500);
        }
        System.out.println();
        System.out.println("Proszę o to zamówiona pizza " + this.getClass().getSimpleName()+'\n');
    }
    public void DoprawOliwaBazylia() {
        try {
            Thread.sleep(1000);
            System.out.println("Doprawiono oliwą i szczyptą bazylii");
        } catch (InterruptedException x) {
            System.out.println("Całą oliwe zużyto do walk w basenie!");
        }
    }
    public void DodajExtraSer() {
        try {
            Thread.sleep(1000);
            System.out.println("Extra ser dodany!");
        } catch (InterruptedException x) {
            System.out.println("Ser wyszedł bokiem");
        }
    }
    public void DodajOliwki_Kapary() {
        try {
            Thread.sleep(1000);
            System.out.println("Tryb śródziemnomorski włącznony!");
        } catch (InterruptedException x) {
            System.out.println("Nie ma, zbyt daleko do Włoch - Miskuzi");
        }
    }
}