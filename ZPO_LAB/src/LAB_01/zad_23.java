package LAB_01;
import java.util.Scanner;
public class zad_23 {
    public static void main(String[] args) {
        int ilosc0=0;
        int iloscdodatnich=0;
        int iloscujemnych=0;
        System.out.print("Podaj ilość: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i=0;i<x;i++) {
            System.out.print("Podaj liczbe: ");
            Scanner in1 = new Scanner(System.in);
            int y = in1.nextInt();
            if(y==0)
            { ilosc0++; }
            else if(y>0)
            { iloscdodatnich++; }
            else if(y<0)
            { iloscujemnych++; }
        }
        System.out.println("Ilosc zer: "+ilosc0 +'\n'+ "Ilosc dodatnich:" +iloscdodatnich +'\n'+ "Ilosc ujemnych: "+iloscujemnych);
    }
}
