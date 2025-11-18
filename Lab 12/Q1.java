import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Q1 {
    private static final Random rand = new Random();
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
            int pi = randomizedPartition(arr, left, right);

            sort(arr, left, pi - 1);
            sort(arr, pi + 1, right);
        }
    }
    private static int randomizedPartition(ArrayList<Integer> arr, int left, int right) {
        int randomIndex = left + rand.nextInt(right - left + 1);
        Collections.swap(arr, randomIndex, right);
        return partition(arr, left, right);
    }

    public static void display(ArrayList<Integer> arr) {
        for (Integer num : arr) {
            System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 7, 5, 2));
        Q1.sort(arr, 0, 4);

        Q1.display(arr);
    }
}
