import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int arr[], int left, int right) {

        if (left <= right)
            return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left++, right--);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 5, 4, 3, 2, 1 };

        reverse(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}
