public class SumOfFirstNnumbers {

    public static int SumOf(int n) {

        if (n == 0) {

            return 0;
        }
        return n + SumOf(n - 1);
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(SumOf(n));
    }
}
