public class SumOfAllSubarrays {

    public static int sumOf(int[] arr) {

        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                totalSum += sum;
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 3, 2 };

        System.out.println(sumOf(arr));
    }
}