public class Q6 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insertAtBeginning(20);
        l1.insertAtBeginning(11);
        l1.insertAtBeginning(19);
        l1.insertAtBeginning(15);
        l1.insertAtBeginning(12);

        l1.sort();
        l1.print();
    }
}