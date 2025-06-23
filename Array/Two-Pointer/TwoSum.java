import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int ind1 = 0;
        int ind2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(nums[i])) {
                ind1 = map.get(nums[i]);
                ind2 = i;
                break;
            }
            map.put(diff, i);

        }

        return new int[] { ind1, ind2 };
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 7, 11, 15 };
        // int target = 9;

        int[] nums = { 3, 3 };
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
