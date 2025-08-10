
// import java.util.HashMap;
import java.util.*;

public class LongestSubarrayWithSumK {

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int preSum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];

            int remove = preSum - k;

            count += map.getOrDefault(remove, 0);

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int k = 3;

        System.out.println(subarraySum(arr, k));
    }
}