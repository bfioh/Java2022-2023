package lr11.examples;

public class Test3 {
    public static void main(String[] args) {

        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }


        ref = head;
        Node newtail = new Node(123, null);
        //для перемещения по списку - ref, которой в качестве начальной
        // ссылки передаём указатель на голову
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newtail;

        System.out.print(" " + ref.next.value);


    }
}
