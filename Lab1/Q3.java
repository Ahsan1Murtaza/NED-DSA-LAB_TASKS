public class Q3 {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int min = findMin(arr);
        int max = findMax(arr);

        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }
}
