public class ArrayIsSortedOrRotated {

    public static boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;
        for (int i = 1; i <= nums.length; i++) {
            if (nums[(i - 1) % n] > nums[i % n]) {
                count++;
            }
        }

        return (count <= 1);
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 4, 5, 1, 2 };
        // int[] nums = { 2, 1, 3, 4 };
        int[] nums = { 1, 2, 3 };
        System.out.println(check(nums));
    }
}
