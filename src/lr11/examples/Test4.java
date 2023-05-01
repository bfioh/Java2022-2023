package lr11.examples;

public class Test4 {
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

        Node newNode = new Node(44, null);
        ref = head;
        int k = 1; // счётчик элементов

        // поиск нужного положения узла для вставки
        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next.next;
        ref.next = newNode;

    }
}
