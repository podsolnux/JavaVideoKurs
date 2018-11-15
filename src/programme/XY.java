package programme;

public class XY {
    public int x;
    public int y;


    public static void main(String[] args) {
        XY xy = new XY();
        initializeXY(xy);
        System.out.println("x=" + xy.x + ", y=" + xy.y);
    }

    //Klassenmethode
    private static void initializeXY(XY xy) {
        xy.x = 5;
        xy.y = 8;
    }
}
