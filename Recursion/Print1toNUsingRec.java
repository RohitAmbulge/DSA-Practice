public class Print1toNUsingRec {

    public static void print1(int start, int end) {
        if (start > end)
            return;

        System.out.print(start + " ");
        print(++start, end);
    }

    static void print(int start, int end) {
        System.out.print(start + " ");
        if (start == end)
            return;
        print(start + 1, end);

    }

    public static void print2(int n) {
        if (n == 0)
            return;

        print2(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        print2(n);
    }
}