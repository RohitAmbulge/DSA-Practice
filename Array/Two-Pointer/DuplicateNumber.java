import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

    public static int findDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                result = nums[i];
                break;
            }

            set.add(nums[i]);
        }

        return result;

    }

    public static void main(String[] args) {
        // int[] num = { 1, 3, 4, 2, 2 };
        int[] num = { 3, 1, 3, 4, 2 };

        System.out.println(findDuplicate(num));
    }
}
