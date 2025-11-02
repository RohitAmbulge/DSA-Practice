import java.util.ArrayList;

public class DuplicateAndMissingElement {

    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int duplicate = -1, missing = -1;

        for (int i = 1; i <= arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (i == arr[j])
                    count++;
            }

            if (count == 0)
                missing = i;
            if (count == 2)
                duplicate = i;
        }

        list.add(duplicate);
        list.add(missing);

        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 6, 2, 1, 1 };
        System.out.println(new DuplicateAndMissingElement().findTwoElement(arr));
    }
}