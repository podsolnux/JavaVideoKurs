package programme;

public class CallByReferenceDemo {
    static int x = 0 ;
    static int y = 0;

    public static void main(String[] args) {
//        int x = 0;
//        int y = 0;
        initializeXY();
        System.out.println("x=" + x + ", y=" + y);
    }

    private static void initializeXY(int x, int y) {
        x = 5;
        y = 8;
    }

    private static void initializeXY() {
        x = 5;
        y = 8;
    }

    public class XY{
        public int x;
        public int y;
    }
    public void initializeXY(XY xy) {
        xy.x = 5;
        xy.y = 8;
    }
}
