import java.util.Scanner;

public class IsArmstrong {

    public static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        int noOfDigits = countDigits(num);

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, noOfDigits);
            num /= 10;
        }

        if (sum == temp) {
            System.out.println(temp + " is Armstrong Number");
        } else {
            System.out.println(temp + " is not Armstrong Number");
        }

    }
}
