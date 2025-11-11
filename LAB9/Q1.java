// Implement an insertAtPosition() function for a CLL
public class Q1 {
    public static void main(String[] args) {
        CircularSingly cs = new CircularSingly();

        cs.insertAtBeginning(10);
        cs.insertAtLast(20);
        cs.insertAtPosition(1, 15);

        cs.display();
    }
}
