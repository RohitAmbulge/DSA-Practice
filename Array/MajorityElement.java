public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int n = nums.length;
        int temp = nums[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (count == 0) {
                temp = nums[i];
            }
            if (nums[i] == temp) {
                count++;
            } else {
                count--;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        // int[] nums = { 3, 2, 3 };
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println(majorityElement(nums));
    }
}
