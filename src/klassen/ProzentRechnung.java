package klassen;

public class ProzentRechnung {
    private double wert;

    public ProzentRechnung(int wert) {
        this.wert = (wert >= 0) ? wert : 0;
    }

    public double wertZuProzent(int wert) {
        return wert * 100 / getWert();
    }

    public double getWert() {
        return wert;
    }

    public double prozentZuWert(int prozent) {
        return getWert() * prozent / 100;
    }

    public static void main(String[] args) {
        ProzentRechnung pr = new ProzentRechnung(500);
        System.out.println(pr.wertZuProzent(1000));
        System.out.println(pr.wertZuProzent(23));
        System.out.println(pr.prozentZuWert(50));
        System.out.println(pr.prozentZuWert(1));
    }
}
