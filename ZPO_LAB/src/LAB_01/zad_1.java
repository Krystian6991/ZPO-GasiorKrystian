package LAB_01;
import java.util.Scanner;
public class zad_1 {
        public static int Silnia (int cyfra) {
            if (cyfra==0) return 1;
            else return cyfra*Silnia(cyfra-1);
        }
        public static void main(String[] arg) {
            int x;
            int y;
            int wynik1=0;
            int wynik2=1;
            int wynik3=0;
            float wynik4=0;
            int wynik5=1;
            int wynik6=0;
            int wynik7=0;
            int wynik8=0;
            System.out.println("Podaj liczbę x");
            Scanner skan = new Scanner(System.in);
            x=skan.nextInt();

            for (int i=0; i<x; i++) {
                System.out.println("Podaj x");
                Scanner cyfra = new Scanner(System.in);
                y = cyfra.nextInt();
                wynik1 += y;
                wynik2 *= y;
                wynik3 += Math.abs(y);
                wynik4 += Math.sqrt(Math.sqrt(y));
                wynik5 *= Math.abs(y);
                wynik6 += Math.pow(y, 2);
                wynik7 += Math.pow((-1),i)*y;

                for (int j=0; j>x; j++) {
                    wynik8+= (Math.pow((-1),i+1)*y)/Silnia(j);
                }
            }
            System.out.println("a1+a2+...+an="+wynik1+'\n'+
            "a1*a2*...*an="+wynik2 +'\n'+
            "|a1|+|a2|+...+|an|="+wynik3 +'\n'+
            "sqrt|a1|+sqrt|a2|+...+sqrt|an|="+wynik4+'\n'+
            "|a1|*|a2|*...*|an|="+wynik5+'\n'+
            "a1^2+a2^2+...+an^2="+wynik6+'\n'+
            "a1+a2+...+an="+wynik1+" oraz "+"a1*a2*...*an="+wynik2+'\n'+
            "a1-a2+...+(-1)^n+1*an="+wynik7);
        }
}
