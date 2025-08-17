public class MeanOfAnArray {

    public static int sum(int[] arr, int n) {
        if (n < 0)
            return 0;

        return arr[n] + sum(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 6, 5, 8, 7 };

        int n = arr.length - 1;
        System.out.println(sum(arr, n) / (n + 1));

    }
}