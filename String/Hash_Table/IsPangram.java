// package Hash_Table;

public class IsPangram {

    public static boolean checkIfPangram(String sentence) {

        int[] count = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            count[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));
    }
}
