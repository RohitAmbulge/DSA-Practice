public class MeanOfAnArray {

    public static int sum(int[] arr, int n) {
        if (n < 0)
            return 0;

        return arr[n] + sum(arr, n - 1);

    }

    public static int sum2(int[] arr, int n, int sum) {
        if (n < 0)
            return sum;

        return sum2(arr, n - 1, sum + arr[n]);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 4, 4 };

        int n = arr.length - 1;
        System.out.println(sum2(arr, n, 0) / (n + 1));

    }
}