import java.util.Arrays;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public String toString() {
        return "(" + key + "," + value + ")";
    }
}

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 56, 10000, 167 };

        System.out.println(getMinMax(arr));
    }

    public static Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        return fun(arr, 0, maximum, minimum);

    }

    public static Pair<Integer, Integer> fun(int[] arr, int i, int maximum, int minimum) {

        if (i == arr.length)
            return new Pair<>(minimum, maximum);

        return fun(arr, i + 1, Math.max(arr[i], maximum), Math.min(arr[i], minimum));
    }

}
