public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {

        long left = 1;
        long right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // int num = 16;
        int num = 14;

        System.out.println(isPerfectSquare(num));
    }
}