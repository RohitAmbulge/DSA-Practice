import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {

    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int el : arr1) {
            set.add(el);
        }

        for (int el : arr2) {
            set.add(el);
        }

        for (int key : set) {
            union.add(key);
        }

        return union;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        ArrayList<Integer> union = union(arr1, arr2);

        System.out.println("After union : ");
        for (int val : union) {
            System.out.println(val);
        }
    }

}
