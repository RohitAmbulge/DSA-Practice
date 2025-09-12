public class LengthOfLastWorld {

    public static int lengthOfLastWord(String s) {

        String str = s.trim();

        if (str.length() <= 1)
            return str.length();
        int first = str.length() - 1;
        int last = first;

        while (str.charAt(first) != ' ') {
            if (first == 0)
                return last + 1;
            first--;
        }

        return last - first;

    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}