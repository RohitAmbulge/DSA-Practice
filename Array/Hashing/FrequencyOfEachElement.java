
public class FrequencyOfEachElement {

    public static void frequencyOfElements(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " : " + count);
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 10, 5, 10, 15, 10, 5 };
        int arr[] = { 2, 2, 3, 4, 4, 2 };
        frequencyOfElements(arr);

    }
}
