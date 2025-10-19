import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new Queue<>();
        int choice, value;

        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    System.out.println("Dequeued value: " + queue.dequeue());
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
