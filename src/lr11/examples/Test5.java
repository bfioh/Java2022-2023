package lr11.examples;

public class Test5 {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        // вывод на экран
        Node ref = head;
        System.out.println("Было:");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

        ref = head;
        while  (ref.next.next != null){
            ref = ref.next;
        }

        ref.next=null;

    }
}
