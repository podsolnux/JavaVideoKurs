package programme;

public class QuersummeBerechnung {
    /*    5   Quersumme = 5
        11  Quersumme = 1 + 1 = 2
        923 Quersumme = 9 + 2 + 3 = 14*/
    public static void main(String[] args) {
        System.out.println(QuersummeBerechnung.berechneQuersumme(53));
        System.out.println(QuersummeBerechnung.berechneQuersumme(81));
        System.out.println(QuersummeBerechnung.berechneQuersumme(75));
    }

    public static int berechneQuersumme(int zahl) {
        if (zahl >= 10 && zahl <= 99){
            return zahl/10 + zahl%10;
        }
        return 0;
    }
}
