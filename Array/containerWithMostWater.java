public class containerWithMostWater {

    public static int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int maxAmount = 0;

        while (i < j) {
            int minHeight = Math.min(height[i], height[j]);
            int width = j - i;

            if (maxAmount < minHeight * width) {
                maxAmount = minHeight * width;
            }

            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxAmount;
    }

    public static void main(String[] args) {
        // int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] height = { 1, 1 };
        System.out.println(maxArea(height));
    }
}
