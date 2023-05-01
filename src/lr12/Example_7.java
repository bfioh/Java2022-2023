package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example_7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = in.nextLine();

        List<String> strings = List.of(str.split(" "));

        System.out.println("Введите значение:");
        int num = in.nextInt();

        List<String> stringsResult = filterStrings(strings, num);

        System.out.println("Строки, длиннее введённого значения:" + "\n" + stringsResult);
    }

    public static List<String> filterStrings(List<String> list, int num) {
        return list.stream()
                .filter(s-> s.length()>num).collect(Collectors.toList());
    }
}
