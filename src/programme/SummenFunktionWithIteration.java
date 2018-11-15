package programme;

public class SummenFunktionWithIteration {
    public static void main(String[] args) {
        String zahl = args[0];
        int z = Integer.parseInt(zahl);
        long ergebnis = berechneSumme(z);
        System.out.println("Die Summe von " + z + " ist " + ergebnis);
    }

//    static long berechneSumme(int zahl) {
//        long result = zahl;
//        int zwischenzahl = zahl - 1;
//        while (zahl - 1 != 0) {
//            result += zwischenzahl;
//            zahl = zwischenzahl;
//            zwischenzahl--;
//        }

    static long berechneSumme(int zahl) {
        int result = 0;
        for (int i = zahl; i > 0; i--) {
            result += i;

        }

//        int result = zahl;
//        for (int i = zahl-1; i > 0; i--) {
//            result += i;
//
//        }

        //bessere Variante:
//        int result = 0;
//        while (zahl > 0) {
//            result += zahl;
//            zahl--;
//        }

        return result;
        //Mit Rekursion:
//        if(zahl == 1){
//            return 1;
//        }
//        return zahl + berechneSumme(zahl-1);
    }
}
