package lr11.Example_8;

import lr11.examples.Node;

public class Example_b {

    public static Node createHeadRec(Node head) {

        if (head.value < 10) {
            head = new Node(1 + head.value, head);
            createHeadRec(head);
        }
        return head;
    }

    public static void createTailRec(Node head) {
        Node newtail = new Node(8, null);
        Node ref = head;

        if (ref.next != null) {
            createTailRec(ref.next);
        }
        ref.next = newtail;
    }

    public static void toStringRec(Node head) {
        Node ref = head;

        if (ref != null) {
            System.out.print(" " + ref.value);
            toStringRec(ref.next);
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        head = createHeadRec(head);
        createTailRec(head);
        toStringRec(head);
    }
}
