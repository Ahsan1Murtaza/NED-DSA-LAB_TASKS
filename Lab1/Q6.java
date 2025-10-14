import java.util.Map;
import java.util.HashMap;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,3,1,6,7,3,2};

        // Solution 1:
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int freq[] = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                continue;
            }
            System.out.println(i + " -> " + freq[i] + " times");
        }


        // Solution 2:
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> freq : map.entrySet()) {
//            System.out.println(freq.getKey() + " -> " + freq.getValue() + " times");
//        }
    }
}
