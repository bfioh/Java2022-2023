package lr11.examples;

public class Node {     // класс - структура элемента спискаё
    public int value;   // значение
    public Node next;   //поле - ссылка на следующий узел

    public Node(int value, Node next) { // конструктор класса
        this.value = value;
        this.next = next;
    }
}
