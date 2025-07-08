import java.util.Arrays;

public class RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        int[] temp = new int[nums.length];

        while (left <= right) {
            if (nums[index] > 0) {
                temp[left++] = nums[index++];
            } else {
                temp[right--] = nums[index++];
            }
        }

        left = 0;
        right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = temp[left++];
            } else {
                nums[i] = temp[right--];
            }
        }

        return nums;

    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };

        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
