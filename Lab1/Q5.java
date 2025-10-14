import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {

        int[] arr = {5,2,4,1,10,9,2};

        Arrays.sort(arr);

        System.out.println("The second largest element is " + arr[arr.length - 2]);

    }
}
