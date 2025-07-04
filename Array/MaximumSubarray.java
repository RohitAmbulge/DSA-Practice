public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum = Math.max(sum + nums[i], nums[i]);

            max = Math.max(sum, max);

        }

        return max;
    }

    public static void main(String[] args) {
        // int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] nums = { 5, 4, -1, 7, 8 };

        System.out.println(maxSubArray(nums));

    }
}
