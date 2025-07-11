public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int temp = x;

        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        return (temp == reverse);
    }

    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
}
