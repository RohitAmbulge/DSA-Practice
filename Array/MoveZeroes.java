class MoveZeroes {

    public static void moveZeroes(int nums[]) {

        int i = 0, j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };

        moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}