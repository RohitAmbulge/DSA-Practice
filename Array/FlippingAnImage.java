import java.util.Arrays;

public class FlippingAnImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int half = n / 2;

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;
                left++;
                right--;
            }
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}
