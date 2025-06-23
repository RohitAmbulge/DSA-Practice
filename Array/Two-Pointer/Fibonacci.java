public class Fibonacci {

    public static void fibonacci(int num) {

        int k = 0;
        int temp = k + 1;

        while (num > 0) {

            System.out.print(k + " ");
            int store = k;
            k = temp;
            temp = temp + store;
            num--;

        }
    }

    public static void main(String[] args) {
        int num = 8;
        fibonacci(num);
    }
}
