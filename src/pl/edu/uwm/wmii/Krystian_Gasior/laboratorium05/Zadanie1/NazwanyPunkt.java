package pl.edu.uwm.wmii.Krystian_Gasior.laboratorium05.Zadanie1;

    class NazwanyPunkt extends Punkt
    {
        NazwanyPunkt(int x, int y, String name)
        {
            super(x, y);
            this.name = name;
        }

        public void show()
        {
            System.out.println(name + ":<" + x() + ", " + y() + ">");
        }

        private String name;
    }

