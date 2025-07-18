
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }

        return true;

    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
