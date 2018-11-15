package klassen;
public class QuickCalc {
    private int wert;

    QuickCalc(int initWert) {
        wert = initWert;
        druckeWert(wert);
    }

    private void druckeWert(int wert) {
        System.out.println("WERT = " + wert);
    }

    public QuickCalc plus(int plusWert) {
        System.out.println("+ " + plusWert);
        wert = wert + plusWert;
        druckeWert(wert);
        return this;
    }

    public QuickCalc plus(QuickCalc plusWert) {
        return plus(plusWert.wert);
    }

    public QuickCalc minus(int minusWert) {
        System.out.println("- " + minusWert);
        wert = wert - minusWert;
        druckeWert(wert);
        return this;
    }

    public QuickCalc minus(QuickCalc minusWert) {
        return minus(minusWert.wert);
    }

    public QuickCalc invertiere() {
        System.out.println("<invertiert>");
        wert = wert * -1;
        druckeWert(wert);
        return this;
    }

    public static void main(String[] args) {
//        new QuickCalc(10).plus(3).minus(2).invertiere()
//                .plus(1).minus(7).invertiere().plus(13);

        System.out.println("QuickCalc 1:");
        QuickCalc q1 = new QuickCalc(-9).plus(3).minus(1).invertiere().plus(3);
        System.out.println("QuickCalc 2:");
        QuickCalc q2 = new QuickCalc(5).invertiere().plus(11).minus(5);
        System.out.println("QuickCalc 3:");
        new QuickCalc(5).plus(q1).minus(2).minus(q2).plus(q2.invertiere());
    }
}
