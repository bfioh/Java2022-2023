package lr3;

import java.util.Scanner;

public class example_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели(от 1 до 7): ");
        int a = in.nextInt();
        String aString;
        switch (a) {
            case 1:  aString = "Понедельник";
                break;
            case 2:  aString = "Вторник";
                break;
            case 3:  aString = "Среда";
                break;
            case 4:  aString = "Четверг";
                break;
            case 5:  aString = "Пятница";
                break;
            case 6:  aString = "Суббота";
                break;
            case 7:  aString = "Воскресенье";
            break;
            default: aString = "Не знаем такого";
                break;
        }
        System.out.println(aString);
    }
}
