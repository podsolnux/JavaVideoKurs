package programme;

public class VarArgsDemo {
    public static void main(String[] args) {
        System.out.println(addiere(5, 6));
        System.out.println(addiere(5, 6, 3));
        System.out.println(addiere(5, 6, 4, 5));
    }

    static int addiere(int zahl, int zweiteZahl, int... weitereZahlen) {
        int result = zahl + zweiteZahl;
        for (int i : weitereZahlen) {
            result += i;
        }
        return result;
    }
}
