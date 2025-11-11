public class Main {
    public static void main(String[] args) {

        System.out.println("Circular Singly");
        CircularSingly cs = new CircularSingly();

        cs.insertAtBeginning(10);
        cs.insertAtBeginning(20);
        cs.insertAtBeginning(30);
        cs.insertAtBeginning(40);

        cs.display();

        cs.insertAtLast(2);
        cs.display();

        cs.insertAtPosition(0, 60);
        cs.display();

        cs.insertAtPosition(6, 22);
        cs.display();

        cs.insertAtPosition(1, 33);
        cs.display();

        System.out.println(cs.search(20));

        cs.deleteFirst();
        cs.display();


        System.out.println("Circular Doubly");
        CircularDoubly cd = new CircularDoubly();

        cd.insertAtBeginning(10);
        cd.insertAtBeginning(20);
        cd.insertAtBeginning(30);
        cd.insertAtBeginning(40);

        cd.display();

        cd.insertAtLast(2);
        cd.display();

        cd.insertAtPosition(0, 60);
        cd.display();

        cd.insertAtPosition(6, 22);
        cd.display();

        cd.insertAtPosition(1, 33);
        cd.display();

        cd.deleteFirst();
        cd.display();
    }
}
