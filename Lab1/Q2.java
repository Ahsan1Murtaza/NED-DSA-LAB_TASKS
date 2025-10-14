public class Q2 {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int findAverage(int[] arr) {

        int total = findSum(arr);

        return total / arr.length;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int sum = findSum(arr);
        int average = findAverage(arr);

        System.out.println("The sum is " + sum + " and average is " + average);
    }
}
