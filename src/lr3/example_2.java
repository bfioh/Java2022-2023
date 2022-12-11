package lr3;
import java.util.Scanner;

public class example_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String a = in.next();
        a = switch (a.toLowerCase()) {
            case "понедельник" -> "Понедельник";
            case "вторник" -> "Вторник";
            case "среда" -> "Среда";
            case "четверг" -> "Четверг";
            case "пятница" -> "Пятница";
            case "суббота" -> "Суббота";
            case "воскресенье" -> "Воскресенье";
            default -> "Такого дня недели не существует";
        };
        System.out.println(a);
    }
}
