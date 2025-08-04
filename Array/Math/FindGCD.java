public class FindGCD {

    public static int print(int n1, int n2) {
        int gcd = 1;
        for (int i = Math.min(n1, n2); i >= 1; i--) {

            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public static int print2(int a, int b) {
        while (a > 0 && b > 0) {

            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0)
            return b;

        return a;
    }

    public static int print3(int a, int b) {

        if (b == 0)
            return b;

        return print3(b, a % b);
    }

    public static void main(String[] args) {
        int N1 = 18;
        int N2 = 33;

        System.out.println(print(N1, N2));
    }
}