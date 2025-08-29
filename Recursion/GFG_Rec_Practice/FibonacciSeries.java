public class FibonacciSeries {

    public static void fibonacci(int i, int n, int[] arr) {
        if (i == n)
            return;

        arr[i] = arr[i - 1] + arr[i - 2];
        System.out.println(i + " " + arr[i]);
        fibonacci(i + 1, n, arr);

    }

    public static void main(String[] args) {
        int[] result = new int[5];

        result[0] = 0;
        result[1] = 1;

        fibonacci(2, 5, result);

    }
}
