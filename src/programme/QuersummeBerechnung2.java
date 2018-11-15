package programme;

public class QuersummeBerechnung2 {
    /*    5   Quersumme = 5
        11  Quersumme = 1 + 1 = 2
        923 Quersumme = 9 + 2 + 3 = 14*/
    public static void main(String[] args) {
        System.out.println(QuersummeBerechnung2.berechneQuersumme(53));
        System.out.println(QuersummeBerechnung2.berechneQuersumme(81));
        System.out.println(QuersummeBerechnung2.berechneQuersumme(754));
        System.out.println(QuersummeBerechnung2.berechneQuersumme(136));
    }

    public static int berechneQuersumme(int zahl) {
        int ergebnis = 0;
        String string = Integer.toString(zahl);
        //or
//        String string = zahl + "";
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            ergebnis += Integer.parseInt(String.valueOf(ch));
        }
        return ergebnis;
    }
}
