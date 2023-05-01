package lr11.examples;

public class Test {
    public static void main(String[] args) {

        // создание несвязанных узлов с помощью конструктора
        Node node0 = new Node(0, null); // нулевой узел - голова
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null); // хвост

        // связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        //вывод списка с использованием вспомогательной переменной ref,
        // соответствующей текущему значению ссылки при прохождении по списку
        Node ref = node0; // голова
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
