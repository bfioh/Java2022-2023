package lr11.examples;

public class Test2 {
    public static void main(String[] args) {
        // добавление элементов с перемещением головы ( наращивание с головы)
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        // вывод на экран
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
