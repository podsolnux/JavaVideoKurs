package programme;

public class CodeLabelDemo {
    public static void main(String[] args) {

//        meinLabel:2
//        for (int k = 0; k < 10; k++) {
//            System.out.println(" Test 1");
//            int i = 1;
//            if (i == 1) {
////                break meinLabel;
//                continue meinLabel;
//            }
//            System.out.println(" Test 2");
//        }

        meinLabel:
        for (int k = 0; k < 10; k++) {
            for (int i = 0; i < 10; i++) {
                System.out.println("K = " + k + ", I = " + i);
                if (k == 5 && i == 5) {
//                    break meinLabel;
                    continue meinLabel;
                }
            }
        }
    }
}
