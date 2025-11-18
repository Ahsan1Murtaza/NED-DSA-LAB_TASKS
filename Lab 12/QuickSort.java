import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort {
    private static int partition(ArrayList<Integer> arr, int left, int right) {
        int i = left - 1;
        int pivot = arr.get(right);

        for (int j = left; j <= right - 1; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, right);
        return (i + 1);
    }

    public static void sort(ArrayList<Integer> arr, int left, int right) {
        if (left < right) {
            int pi = partition(arr, left, right);

            sort(arr, left, pi - 1);
            sort(arr, pi + 1, right);
        }
    }

    public static void display(ArrayList<Integer> arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 7, 5, 2));
        QuickSort.sort(arr, 0, 4);

        QuickSort.display(arr);
    }
}
