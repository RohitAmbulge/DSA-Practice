import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums) {

        int left = 0, mid = 0, right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 0, 2, 1, 1, 0 };
        int[] nums = { 2, 0, 1 };
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
