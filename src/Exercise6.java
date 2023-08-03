public class Exercise6 {

    void print(int height) {
        for (int row = 1; row <= height; row++) {
            for (int space = 1; space <= height - row; space++) {
                System.out.print(" ");
            }
            int maxQuantity = 2 * row - 1;
            int leftNum = row;
            for (int element = 1; element <= maxQuantity; element++) {
                if (element <= row) {
                    System.out.print(leftNum);
                    leftNum++;
                } else {
                    System.out.print(leftNum);
                    leftNum--;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Exercise6 e6 = new Exercise6();
        e6.print(10);
    }

//    public static void main(String[] args) {
//        for (int row = 1; row <= 10; row++) {
//            for (int space = 0; space < 10 - row; space++) {
//                System.out.print(" ");
//            }
//            //Completed print space of each row
//            int maxQuantity = 2 * row - 1;
//            for (int element = 1; element <= maxQuantity; element++) {
//                if (element <= row)
//                    System.out.print((element + row - 1) % 10);
//                else
//                    System.out.print((3 * row - 1 - element) % 10);
//            }
//            System.out.println();
//        }
//    }
}
