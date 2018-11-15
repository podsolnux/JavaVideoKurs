package programme;

import klassen.Auto;

public class AutoProgramm {
    public static void main(String[] args) {
        System.out.println("Das Programm ist gestartet...");
        Auto ford = new Auto(100, "Ford");
        Auto bmw = new Auto(180, "BMW");

        //Punkt-Notation:
        ford.tunen(50);

        Auto.printInfos(bmw);
        Auto.printInfos(ford);
//        Auto.erstellteAutos

//        System.out.println(ford.getLeistung());
//        System.out.println(bmw.getLeistung());
//        System.out.println(bmw.getHersteller());
    }
}
