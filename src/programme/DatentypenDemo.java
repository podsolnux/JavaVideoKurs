package programme;

import klassen.Obst;

import java.awt.*;

public class DatentypenDemo {
    public static void main(String[] args) {
//        primitive Datentypen:
        //default wert ist 0
        int i = 25; //Integer
        System.out.println(Integer.MAX_VALUE);
        long l = 5000000000000L; //Long
        short  s = 50; // Short
        byte b = 20; //Byte
        double d = 2.5; //Double
        float g = 2.5f; //Float

        char ch = 'A'; //oder 65 //Charakter
        //default wert ist 'false'
        boolean bool = true;
        System.out.println(ch);

        //komplexe Datentypen:
        Obst obst = new Obst("Birne", 2.0, 123);
        Color color = new Color(255,0,0);
    }
}
