public class Q2 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insertAtBeginning(10);
        l1.insertAtBeginning(11);
        l1.insertAtBeginning(12);

        l1.print();
        l1.deleteAtLast();
        l1.print();
    }
}