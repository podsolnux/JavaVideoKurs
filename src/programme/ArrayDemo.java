package programme;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray = new int[2];
        int[] intArray2 = {1, 2, 3}; // only when declaration
        intArray[0] =5;
        intArray[1] =7;

        //or when overwriting
        intArray = new int[] {5,6,7};

        int  intArray3 []; //not good

//NOK: ERROR: int a[] = new int[2]{5,10};

        int x = 10;
        int[] newArray = new int[x];

        String[][] zweiDimArray = new String[2][0]; //or new String[2][3]
        zweiDimArray[0] = new String[3];
        zweiDimArray[0][0] = "Hans";
        zweiDimArray[0][1] = "Miller";
        zweiDimArray[0][2] = "222 555";
        zweiDimArray[1] = new String[7];

        int[][][] dreiDimArray;

        System.out.println(args.length);
        System.out.println(args[0]);
    }
}
