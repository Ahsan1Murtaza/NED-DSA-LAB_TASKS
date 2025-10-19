import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyLinkedList list = new doublyLinkedList();

        while (true) {
            System.out.println("\n========== DOUBLY LINKED LIST MENU ==========");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at Last");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display Forward");
            System.out.println("8. Display Backward");
            System.out.println("9. Search");
            System.out.println("10. Reverse List");
            System.out.println("11. Merge another list");
            System.out.println("12. Clear Screen");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    System.out.print("Enter index (0-based): ");
                    int index = sc.nextInt();
                    list.insertAtPosition(val, index);
                    break;

                case 4:
                    list.deleteAtBeginning();
                    break;

                case 5:
                    list.deleteAtLast();
                    break;

                case 6:
                    System.out.print("Enter index (0-based): ");
                    list.deleteAtPosition(sc.nextInt());
                    break;

                case 7:
                    list.displayForward();
                    break;

                case 8:
                    list.displayBackward();
                    break;

                case 9:
                    System.out.print("Enter value to search: ");
                    System.out.println(list.search(sc.nextInt()) ? "Found" : "Not Found");
                    break;

                case 10:
                    list.reverse();
                    System.out.println("List reversed.");
                    break;

                case 11:
                    doublyLinkedList list2 = new doublyLinkedList();
                    System.out.print("Enter number of elements in second list: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter element " + (i + 1) + ": ");
                        list2.insertAtEnd(sc.nextInt());
                    }
                    list.merge(list2);
                    System.out.println("Lists merged successfully.");
                    break;
                case 12: // To just clear the console screen
                    for (int i = 0; i < 50; i++) System.out.println();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
