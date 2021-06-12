package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium06.Zadanie2;

import java.time.LocalDate;

abstract class Instrument {

    public String getProducent() {
        return producent;
    }

    public LocalDate getYear() {
        rokProdukcji.getYear();
        return rokProdukcji;
    }

    String producent;
    LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent=producent;
        this.rokProdukcji=rokProdukcji;
    }

    public String toString() {
        return "Producent: " + this.producent + "Rok produkcji" + this.rokProdukcji;
    }

    abstract public void dzwiek ();
}

class Flet extends Instrument {

        public Flet(String producent, LocalDate rokProdukcji)
        {
            super(producent, rokProdukcji);
        }

        public void dzwiek(){
        System.out.println("WRRRRRRR");
    }
}

class Fortepian extends Instrument {

    public Fortepian(String producent, LocalDate rokProdukcji)
    {
        super(producent, rokProdukcji);
    }

    public void dzwiek(){
        System.out.println("PLUUUUUM");
    }
}

class Skrzypce extends Instrument {

    public Skrzypce(String producent, LocalDate rokProdukcji)
    {
        super(producent, rokProdukcji);
    }

    public void dzwiek(){
        System.out.println("SKRRRRRRRRRA");
    }
}