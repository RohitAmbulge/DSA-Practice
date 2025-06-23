public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int n = nums.length;
        int arraySum = 0;

        int totalSum = n * (n + 1) / 2;

        for (int i = 0; i < nums.length; i++) {
            arraySum += nums[i];
        }

        return totalSum - arraySum;

    }

    public static void main(String[] args) {
        // int[] nums = { 3, 0, 1 };
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        System.out.println(missingNumber(nums));
    }
}
