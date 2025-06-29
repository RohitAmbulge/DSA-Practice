import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;
        swapArray(nums, 0, n - k - 1);
        swapArray(nums, n - k, n - 1);
        swapArray(nums, 0, n - 1);

    }

    public static void swapArray(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        // int k = 3;

        int[] nums = { -1, -100, 3, 99 };
        int k = 2;

        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
