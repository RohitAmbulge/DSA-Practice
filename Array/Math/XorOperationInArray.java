public class XorOperationInArray {

    public static int xorOperation(int n, int start) {

        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor = xor ^ (start + (2 * i));
        }

        return xor;
    }

    public static void main(String[] args) {
        int n = 5;
        int start = 0;

        System.out.println(xorOperation(n, start));
    }
}
