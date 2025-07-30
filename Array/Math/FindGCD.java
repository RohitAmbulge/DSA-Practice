public class FindGCD {

    public static int print(int n1, int n2) {
        int max = 0;
        int min = 0;

        if (n1 < n2) {
            min = n1;
            max = n2;
        } else {
            min = n2;
            max = n1;
        }

        for (int i = min; i >= 1; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int N1 = 20;
        int N2 = 15;

        System.out.println(print(N1, N2));
    }
}