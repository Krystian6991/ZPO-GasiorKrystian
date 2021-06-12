package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium04;

import java.util.Random;

public class IntegerSet {
    boolean tab1[] = new boolean[100];
    boolean tab2[] = new boolean[100];

    public void IntegerSet() {

        for (int i = 0; i < 100; i++) {
            tab1[i]=false;
            tab2[i]=false;
            }
        }
    public void union(){
        for (int i=0; i<100; i++) {
            if(tab1[i]==false&&tab2[i]==false) {
                System.out.println("FALSE");
            }
            else {
                System.out.println("TRUE");
            }
        }
    }

    public void intersection(){
        for (int i=0; i<100; i++) {
            if(tab1[i]==true&&tab2[i]==true) {
                System.out.println("TRUE");
            }
            else {
                System.out.println("FALSE");
            }
        }
    }


}