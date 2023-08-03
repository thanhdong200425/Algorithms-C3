public class Exercise20 {
    double sum(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += Math.pow(-1, i + 1) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise20 e = new Exercise20();
        System.out.println(e.sum(3));
    }

}
