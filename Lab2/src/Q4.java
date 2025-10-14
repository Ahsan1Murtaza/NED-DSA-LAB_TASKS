public class Q4 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insertAtBeginning(10);
        l1.insertAtBeginning(11);
        l1.insertAtBeginning(12);

        System.out.println(l1.search(30));
        System.out.println(l1.search(10));
    }
}