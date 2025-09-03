import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int valueOf(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToInt(String s) {

        int result = valueOf(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (valueOf(s.charAt(i)) < valueOf(s.charAt(i + 1))) {
                result = result - valueOf(s.charAt(i));
            } else {
                result = result + valueOf(s.charAt(i));
            }

        }

        return result;
    }

    public static void main(String[] args) {
        String s = "LVIII";

        System.out.println(romanToInt(s));
    }
}