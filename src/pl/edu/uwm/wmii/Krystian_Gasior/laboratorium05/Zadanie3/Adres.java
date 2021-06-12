package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie3;


    public class Adres {
        private String ulica;
        private int numer_domu;
        private int numer_mieszkania;
        private String miasto;
        private int kod_pocztowy;
        public Adres(String ulica1, int numer_domu1,int numer_mieszkania1, String miasto1, int kod_pocztowy1) {
            ulica=ulica1;
            numer_domu=numer_domu1;
            numer_mieszkania=numer_mieszkania1;
            miasto=miasto1;
            kod_pocztowy=kod_pocztowy1;
        }
        public Adres(String ulica1, int numer_domu1, String miasto1, int kod_pocztowy1) {
            ulica=ulica1;
            numer_domu=numer_domu1;
            miasto=miasto1;
            kod_pocztowy=kod_pocztowy1;
        }

       /* boolean publicboolean() {
            boolean wynik;
            int tymczasowa;
            for (int i=0;i<)
            return wynik;
        }
*/
        void pokaz () {
            System.out.println(kod_pocztowy+" "+miasto);
            System.out.println(ulica+" "+numer_domu+" "+numer_mieszkania);
        }


    }

