import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }

            map.put(target - nums[i], i);
        }

        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}