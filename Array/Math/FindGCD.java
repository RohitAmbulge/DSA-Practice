public class FindGCD {

    public static int print(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {

            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        int N1 = 20;
        int N2 = 15;

        System.out.println(print(N1, N2));
    }
}