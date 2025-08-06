import java.util.Scanner;

public class FindPrime {

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        int i = 2;

        while (i <= num / 2 && num % i++ == 0) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num : ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }

    }
}
