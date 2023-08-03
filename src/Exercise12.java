import java.util.Scanner;

public class Exercise12 {
    int factorial(int num) {
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    int minimum(int m) {
        for (int i = 1; i <= m; i++) {
            if (factorial(i) >= m) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Exercise12 e = new Exercise12();
        System.out.println(e.minimum(2000));
    }
}
