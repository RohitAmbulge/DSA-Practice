public class Print1toNUsingRec {

    public static void print(int start, int end) {
        if (start > end)
            return;

        System.out.print(start + " ");
        print(++start, end);
    }

    public static void main(String[] args) {
        int n = 5;
        print(1, n);
    }
}