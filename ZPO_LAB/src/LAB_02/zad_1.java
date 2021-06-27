package LAB_02;
import java.util.Random;
import java.util.Scanner;
public class zad_1 {
    public static void main(String[] args) {
        int parzyste=0, nieparzyste=0, ujemne=0, dodatnie=0, zero=0, maksymalna=0, suma=0, sumadodatnie=0, sumaujemne=0, ciag=0, tymczasowa=0, tymczasowe=0;
        int[] ciagi;
        ciagi=new int[1000];
        System.out.println("Podaj liczbez przedziału od 1 do 1000");
        Scanner podaj = new Scanner(System.in);
        int x = podaj.nextInt();
        int[] tablica;
        tablica = new int[x];
        Random r = new Random();
        for (int i = 0; i < x; i++) {
            tablica[i] = r.nextInt(19998)-9999; }
        for (int j=0; j<x; j++) {
            System.out.print(tablica[j]+" "); }
        for (int k=0; k<x; k++) {
            if (tablica[k]%2==0) {
                parzyste++; }
            if (tablica[k]%2!=0){
                nieparzyste++; }
            if (tablica[k]==0) {
                zero++; }
            if (tablica[k]<0) {
                ujemne++;
                sumaujemne+=tablica[k]; }
            if (tablica[k]>0) {
                dodatnie++;
                sumadodatnie+=tablica[k]; }
            if (tablica[k]>maksymalna) {
                maksymalna=tablica[k];
                if (tablica[k]==maksymalna) {
                    suma++; }
            }
        }
        System.out.println();
        System.out.println("Liczb parzystych jest "+parzyste+'\n'+
        "Liczb nieparzystych jest "+nieparzyste+'\n'+
        "Liczb dodatnich jest "+dodatnie+'\n'+
        "Liczb ujemnych jest "+ujemne+'\n'+
        "Zer jest "+zero+'\n'+
        "Wartosc maksymalna tablicy to "+maksymalna+" i wystepuje "+suma+" razy \n"+
        "Suma licz dodatnich wynosi "+sumadodatnie + '\n'+
        "Suma liczb ujemnych wynosi "+sumaujemne+'\n'+
        "Które wartosci chcesz odwrocic?");
        int[] tablicazast;
        tablicazast =  new int[x];
        for (int o=0; o<x; o++) {
            tablicazast[o]=tablica[o];
        }
        int lewy = podaj.nextInt();
        int prawy = podaj.nextInt();
        if (lewy>prawy) {
            System.out.println("blad! lewy wiekszy od prawego!");
        }
        else {
            int liczn=(prawy-lewy)/2+lewy;
            while (lewy<liczn) {
                tymczasowa = tablicazast[lewy];
                tablicazast[lewy] = tablicazast[prawy];
                tablicazast[prawy] = tymczasowe;
                lewy++;
                prawy--;
            }
        }
        for (int m=0; m<x; m++) {
            System.out.print(tablicazast[m]+" ");
        }
        for (int t: tablica) {
            if(t>0) {
                ciag++;
                if (ciag>tymczasowa) {
                    tymczasowa=ciag; }
            }
            else {
                ciag=0; }
        }
        if (tymczasowa<=ciag) {
            System.out.println("Najdluzszy "+ciag); }
        else {
            System.out.println("Najdluzszy "+tymczasowa); }

        System.out.println();
        System.out.println("Znaki: -1 to liczba ujemna a 1 dodatnia");
        for (int p=0; p<x; p++) {
            if (tablica[p]>0) {
                tablica[p]=1; }
            if (tablica[p]<0) {
                tablica[p]=-1; }
        }
        for (int s=0; s<x; s++) {
            System.out.print(tablica[s]+" ");
        }
    }
}