public class Exercise18 {
    double sum(int n, int x) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (Math.pow(-1, i) * Math.pow(x, i)) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        Exercise18 e = new Exercise18();
        System.out.println(e.sum(2,4));
    }
}
