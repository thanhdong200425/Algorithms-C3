public class Exercise11 {
    int perfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return number;
        }
        return 0;
    }

    void printPerfectNumber() {
        for (int i = 1; i <= 1000; i++) {
            if (perfectNumber(i) != 0) {
                System.out.println(perfectNumber(i));
            }
        }
    }

    public static void main(String[] args) {
        Exercise11 e = new Exercise11();
        e.printPerfectNumber();
    }
}
