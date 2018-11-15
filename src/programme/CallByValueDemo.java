package programme;

import klassen.Obst;

public class CallByValueDemo {
    public static void main(String[] args) {
        int i = 6;
        doStuff(i);
        System.out.println("Nach der Methode: " + i);

        Obst obst = new Obst("Kiwi", 2.50, 200);

        //Umweg, um callByReference zu erreichen
        obst = doStuff(obst);
        System.out.println(obst.getNaehrwert());
        doOtherStuff(obst);
        System.out.println(obst.getNaehrwert());
    }

    static void doStuff(int i) {
        i *= 2;
        System.out.println("In der Methode: " + i);
    }

    static Obst doStuff(Obst obst) {
        obst = new Obst("Kiwi", 2.0, 180);
        return obst;
    }

    static void doOtherStuff(Obst obst) {
        obst.aufpeppen();
    }
}
