import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratingAllSubarrays {

    public static List<List<Integer>> getSubArrays(int[] arr) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> subList = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {
                subList.add(arr[j]);
                list.add(new ArrayList<>(subList));
            }
        }

        return list;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // GeneratingAllSubarrays g = new GeneratingAllSubarrays();

        System.out.println(getSubArrays(arr));

    }
}