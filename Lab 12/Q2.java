import java.util.ArrayList;
import java.util.Arrays;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Q2 {

    private Node getMid(Node head) {
        if (head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        tail.next = (left != null) ? left : right;
        return dummy.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    // Convert ArrayList to Linked List
    public Node buildList(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return null;

        Node head = new Node(arr.get(0));
        Node curr = head;

        for (int i = 1; i < arr.size(); i++) {
            curr.next = new Node(arr.get(i));
            curr = curr.next;
        }

        return head;
    }

    // Display Linked List
    public void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 3, 5, 2));

        Q2 obj = new Q2();
        Node head = obj.buildList(arr);

        head = obj.mergeSort(head);

        obj.display(head);
    }
}
