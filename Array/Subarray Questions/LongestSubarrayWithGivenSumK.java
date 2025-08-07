import java.util.Map;
import java.util.HashMap;

public class LongestSubarrayWithGivenSumK {

    public static int longestSum(int[] arr, int k) {
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

    public static int longestSumUsingMap(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int preSum = 0;
        int maxLen = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (preSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (map.containsKey(preSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(preSum - k));
            }

            if (!map.containsKey(preSum)) {
                map.put(preSum, i);
            }
        }

        return maxLen;

    }

    public static void main(String[] args) {

        int k = 5;
        int[] arr = { 2, 3, 5 };

        System.out.println(longestSum(arr, k));

    }
}