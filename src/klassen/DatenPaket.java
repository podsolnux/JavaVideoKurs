package klassen;
public class DatenPaket {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    DatenPaket(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        System.out.println("Konstruktor mit 6 Parametern ist aufgerufen");
    }

    DatenPaket(int a, int b, int c, int d, int e){
        this(a, b, c, d, e, e+1);
        System.out.println("Konstruktor mit 5 Parametern ist aufgerufen");
    }

    DatenPaket(int a, int b, int c, int d){
        this(a, b, c, d, d+1);
        System.out.println("Konstruktor mit 4 Parametern ist aufgerufen");

    }

    DatenPaket(int a, int b, int c){
        this(a, b, c, c+1);
        System.out.println("Konstruktor mit 3 Parametern ist aufgerufen");
    }

    DatenPaket(int a, int b){
        this(a, b, b+1);
        System.out.println("Konstruktor mit 2 Parametern ist aufgerufen");
    }

    DatenPaket(int a){
        this(a, a +1);
        System.out.println("Konstruktor mit 1 Parameter ist aufgerufen");

    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public static void main(String[] args) {
        DatenPaket datenPaket = new DatenPaket(1);
        System.out.println(datenPaket.getA());
        System.out.println(datenPaket.getB());
        System.out.println(datenPaket.getC());
        System.out.println(datenPaket.getD());
        System.out.println(datenPaket.getE());
        System.out.println(datenPaket.getF());
    }
}
