public class Q4 {
    public static void main(String[] args) {
        CircularSingly cs = new CircularSingly();

        cs.insertAtBeginning(10);
        cs.insertAtLast(20);
        cs.insertAtPosition(1, 15);

        cs.display();
        cs.deleteFirst();
        cs.display();
    }
}
