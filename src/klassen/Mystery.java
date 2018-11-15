package klassen;
public class Mystery {
    int b;

    public Mystery() {
        int a = 0;
        {
            int b = 7;
            a = b;
        }

        System.out.println(a + " , " + b);
    }

    public static void main(String[] args) {
        new Mystery();
    }
}