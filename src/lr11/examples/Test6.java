package lr11.examples;

public class Test6 {
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
        int k = 1;
        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
        //переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;
    }
}
