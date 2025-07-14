public class CountDigitsThatDivideNumber {

    public static int countDigits(int num) {

        int count = 0;
        int temp = num;

        while (num > 0) {
            int digit = num % 10;
            if (temp % digit == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 1248;

        System.out.println(countDigits(num));
    }
}
