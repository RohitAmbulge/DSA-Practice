public class PalindromeString {

    static boolean isPalindrome(String s) {
        // code here

        return palindrome(s, 0, s.length() - 1);

    }

    static boolean palindrome(String s, int left, int right) {
        if (left >= right)
            return true;

        if (s.charAt(left) != s.charAt(right))
            return false;

        return palindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s = "abba";

        System.out.println(isPalindrome(s));
    }
}