import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequency {

    public static void frequency(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int smallFreqN = 0;
        int largeFreqN = 0;

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }

        for (int key : map.keySet()) {
            if (map.get(key) >= maxFreq) {
                maxFreq = map.get(key);
                largeFreqN = key;
            }

            if (map.get(key) <= minFreq) {
                minFreq = map.get(key);
                smallFreqN = key;
            }
        }

        System.out.println(largeFreqN + " has Highest Freq and " + smallFreqN + " has lowest frequency.");

    }

    public static void main(String[] args) {
        // int[] array = { 2, 2, 3, 4, 4, 2 };
        int[] array = { 10, 5, 10, 15, 10, 5 };
        frequency(array);

    }
}
