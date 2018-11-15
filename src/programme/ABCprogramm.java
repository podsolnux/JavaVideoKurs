package programme;

import klassen.A;
import klassen.B;
import klassen.C;

public class ABCprogramm {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();
        a.setVar(10);
        a.printVar();
        b.setVar(3);
        b.printVar();
        System.out.println("b.getVar()= " + b.getVar());
        c.setVar(b.getVar());
        c.printVar();
    }
}
