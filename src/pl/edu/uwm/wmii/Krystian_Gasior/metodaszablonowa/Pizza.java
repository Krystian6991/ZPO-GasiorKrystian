package pl.edu.uwm.wmii.Krystian_Gasior.metodaszablonowa;

abstract public class Pizza {
    public abstract void make();

    public void setDough(String doughType) {
        try {
            Thread.sleep(500);
            System.out.println(doughType+" dough chosen");
        } catch (InterruptedException e) {
            System.out.println("Your dough is gross...");
        }
    }

    public void setSauce(String sauce) {
        try {
            Thread.sleep(500);
            System.out.println(sauce+ " sauce added");
        } catch (InterruptedException e) {
            System.out.println("Your sauce smells bad...");
        }
    }

    public void bake(int timeInMinutes) throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Baking in progress...");
        for(int i=timeInMinutes; i>0; i--) {
            System.out.print(i+"... ");
            Thread.sleep(300);
        }
        System.out.println();
        System.out.println("Your delicious " + this.getClass().getSimpleName() + " is ready!");
        System.out.println();
    }

    public void addOliveOilAndBasil() {
        try {
            Thread.sleep(500);
            System.out.println("Oilve Oil + Basil added");
        } catch (InterruptedException e) {
            System.out.println("Out of olive oil and basil has been eaten by the doggo!");
        }
    }

    public void addMozarellaCheese() {
        try {
            Thread.sleep(500);
            System.out.println("Mozarella cheese added");
        } catch (InterruptedException e) {
            System.out.println("No mozarella. You've eaten all cheese.");
        }
    }

    public void addOlivesAndCapers() {
        try {
            Thread.sleep(500);
            System.out.println("Olives and capers");
        } catch (InterruptedException e) {
            System.out.println("No capers. They went to Italy.");
        }
    }

    public void addSeasonings() {
        try {
            Thread.sleep(500);
            System.out.print("Sprinkle ");
            for(int i=0; i<5; i++) {
                Thread.sleep(500);
                System.out.print(". ");
            }
            System.out.println("Seasonings added");
        } catch (InterruptedException e) {
            System.out.println("No seasonings. You've eaten whole oregano.");
        }
    }
}
