public class Q3 {
    public static void main(String[] args) {
        CircularSingly cs = new CircularSingly();

        cs.insertAtBeginning(10);
        cs.insertAtLast(20);
        cs.insertAtPosition(1, 15);

        System.out.println(cs.search(20));
    }
}
