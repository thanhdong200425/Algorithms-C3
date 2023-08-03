public class Exercise15 {

    int specialNum(int num) {
        int i = num / 100;
        int j = (num / 10) % 10;
        int k = num % 100;
        if (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3) == num) {
            return num;
        }
        return 0;
    }
    void print() {
        int count = 1;
        while (count < 1000) {
            if (specialNum(count) != 0) {
                System.out.println(count);
            }
            count++;
        }
    }

    public static void main(String[] args) {
        Exercise15 e = new Exercise15();
        e.print();
    }
}
