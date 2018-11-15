package programme;

import klassen.Auto;

import java.util.Random;

public class SchleifenDemo {
    public static void main(String[] args) {
        int max = 10;
        for (int i = 1; i <= max; i++) {
            System.out.println(i + ". Durchlauf");

        }

        int[] potenzen = new int[20];
        for (int i = 0; i < potenzen.length; i++) {
            int zahl = (int) Math.pow(2, i + 1);
//            System.out.println(zahl);
            potenzen[i] = zahl;
        }

        for (int i : potenzen) {
            System.out.println(i);
        }

        //while-Schleife
//        Random random = new Random();
//        int zahl = random.nextInt(6) + 1;//Zahlen von 0 bis 6
//        System.out.println("Zahl ist " + zahl);

//        while (zahl != 6) {
//            zahl = random.nextInt(6) + 1;//Zahlen von 0 bis 6
//            System.out.println("Zahl ist " + zahl);
//
//        }

        Random random = new Random();
        int zahl;
        do {
            System.out.println("Im do-Block");
            zahl = random.nextInt(6) + 1;//Zahlen von 0 bis 6
            System.out.println("Zahl ist " + zahl);
        }
        while (zahl != 6);

        int[][] zweiDimArray = new int[3][];
        zweiDimArray[0] = new int[12];
        zweiDimArray[1] = new int[8];
        zweiDimArray[2] = new int[65];
        for (int i = 0; i < zweiDimArray.length; i++) {
            int[] ints = zweiDimArray[i];
            for (int j = 0; j < ints.length; j++) {
                ints[j] = 5;
//                zweiDimArray[i][j]=5;

            }
        }
        int[] randomArray = new int[50];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt();
        }

//        boolean zahlGefunden = false;
//        for (int z : randomArray) {
//            if (z%2==1 && !zahlGefunden){
//                System.out.println("Ungerade Zahl");
//                zahlGefunden = true;
//            }
//        }

        for (int z : randomArray) {
            if (z % 2 == 1) {
                System.out.println("Ungerade Zahl");
                break;
            }
        }
        Auto[] autos = new Auto[10];
        for (int i = 0; i < autos.length; i++) {
            autos[i] = new Auto(50 + i * 5, "TEST");
        }

//        for (Auto auto : autos) {
//            if (auto.getLeistung()> 200){
//                //complexer Code
//            }
//        } BESSER:
        for (Auto auto : autos) {
            if (auto.getLeistung() <= 100) {
                continue;
            }
            //complexer Code
        }
    }
}
