import java.util.Scanner;
class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter Array Elements");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + " = "  + arr[i]);
        }
    }
}