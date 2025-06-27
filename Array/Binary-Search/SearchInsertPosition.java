public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int index = 0;

        if (target > nums[n - 1])
            return n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
                index = mid;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 3, 5, 6 };
        // int target = 5;

        int[] nums = { 1, 3, 5, 6 };
        // int target = 2;
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

}
