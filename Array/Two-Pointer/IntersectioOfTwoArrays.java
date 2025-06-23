import java.util.Arrays;

public class IntersectioOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        int[] temp = new int[1001];

        for (int num : nums1) {
            temp[num] = 1;
        }

        int count = 0;
        for (int num : nums2) {
            if (temp[num] == 1) {
                count++;
                temp[num] = 2;
            }
        }

        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < 1001; i++) {
            if (temp[i] == 2) {
                result[j] = i;
                j++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 2, 1 };
        // int[] nums2 = { 2, 2 };

        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

}
