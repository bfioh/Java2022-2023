package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example_9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = in.nextLine();

        List<String> strings = List.of(str.split(" "));

        List<String> stringsResult = filterStrings(strings);

        System.out.println("Строки, содержащие только буквы:" + "\n" + stringsResult);
    }

    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[а-яА-ЯёЁ]*$");
    }

    public static List<String> filterStrings(List<String> list) {
        return list.stream()
                .filter(s->isAlpha(s)).collect(Collectors.toList());
    }
}