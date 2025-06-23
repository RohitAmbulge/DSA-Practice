
public class SquareRootOfX {

    public static int mySqrt(int x) {

        int left = 1;
        int right = x / 2;
        int result = 0;

        if (x == 1 || x == 0)
            return x;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // int x = 4;

        int x = 8;
        System.out.println(mySqrt(x));

    }

}
