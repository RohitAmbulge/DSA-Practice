public class LongestSubarrayWithGivenSumK {

    public static int longestSum(int[] arr, int n, int k) {
        int maxLen = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, (j - i) + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int n = 9;
        int k = 10;
        int[] arr = { 2, 3, 5, 1, 9 };

        System.out.println(longestSum(arr, n, k));

    }
}