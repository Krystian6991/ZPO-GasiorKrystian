package LAB_05.zad_3;

public class Adress {
    private String ul, miasto;
    private int nrdomu,nrmieszkania, kod_pocztowy;
    public Adress(String ul1, int nrdomu1,int nrmieszkania1, String miasto1, int kod_pocztowy1) {
        ul=ul1;
        nrdomu=nrdomu1;
        nrmieszkania=nrmieszkania1;
        miasto=miasto1;
        kod_pocztowy=kod_pocztowy1; }
    public Adress(String ul1, int nrdomu1, String miasto1, int kod_pocztowy1) {
        ul=ul1;
        nrdomu=nrdomu1;
        miasto=miasto1;
        kod_pocztowy=kod_pocztowy1; }
    void wyswietl () {
        System.out.println(kod_pocztowy+" "+miasto);
        System.out.println(ul+", "+nrdomu+", "+nrmieszkania);
    }}