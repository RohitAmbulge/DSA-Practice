import java.util.*;

public class FirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int firstPosition = -1;
        int lastPosition = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                if (firstPosition == -1) {
                    firstPosition = i;
                }

                lastPosition = i;
            }

        }

        return new int[] { firstPosition, lastPosition };
    }

    public static void main(String[] args) {
        // int[] nums = { 5, 7, 7, 8, 8, 10 };
        // int target = 8;

        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

}
