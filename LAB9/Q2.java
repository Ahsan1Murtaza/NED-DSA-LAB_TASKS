public class Q2 {
    public static void main(String[] args) {
        CircularDoubly cd = new CircularDoubly();

        cd.insertAtBeginning(10);
        cd.insertAtLast(20);
        cd.insertAtPosition(1, 15);

        cd.display();
    }
}
