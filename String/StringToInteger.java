import java.util.Scanner;

public class StringToInteger {

    public static void myAtoi(String s) {

        String str = s.trim();

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                result = result * 10 + (ch - '0');
                System.out.println(result);

            }

            if (Character.isLetter(ch)) {
                break;
            }

        }

        // return str;
    }

    public static void main(String[] args) {
        String s = "words and 987";

        // System.out.println(myAtoi(s));
        myAtoi(s);
    }
}
