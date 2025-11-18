import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    private static void merge(ArrayList<Integer> arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();

        for (int i = 0; i <  n1; i++) {
            L.add(arr.get(left + i));
        }
        for (int i = 0; i < n2; i++) {
            R.add(arr.get(mid + 1 + i));
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L.get(i) <= R.get(j)) arr.set(k++, L.get(i++));
            else arr.set(k++, R.get(j++));
        }

        while (i < n1) arr.set(k++, L.get(i++));
        while (j < n2) arr.set(k++, R.get(j++));
    }

    public static void sort(ArrayList<Integer> arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void display(ArrayList<Integer> arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 3, 5, 2));
        MergeSort.sort(arr, 0, 4);

        MergeSort.display(arr);
    }


}

