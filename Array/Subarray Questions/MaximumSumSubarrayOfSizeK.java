public class MaximumSumSubarrayOfSizeK {

    public static int maximumSumSubarray(int[] arr, int k) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                if ((j - i) + 1 > k) {
                    break;
                }
                sum += arr[j];
                if ((j - i) + 1 == k && sum > maxSum) {
                    maxSum = sum;
                }

            }
        }

        return maxSum;

    }

    public static int maximumSumSubarray2(int[] arr, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        int second = 1;
        int first = k;

        while (first < arr.length) {

            sum -= arr[second - 1];
            sum += arr[first];

            if (sum > maxSum) {
                maxSum = sum;
            }

            first++;
            second++;

        }

        return maxSum;

    }

    public static int maximumSumSubarray3(int[] arr, int k) {
        int i = 0, j = 0;
        int sum = 0, maxSum = 0;

        while (j < arr.length) {
            if (j < k) {
                sum += arr[j];
                j++;
            } else {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[i++];
                sum += arr[j++];
            }
        }

        maxSum = Math.max(maxSum, sum);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400 };
        int k = 2;

        // int k = 1;

        System.out.println(maximumSumSubarray3(arr, k));

    }
}