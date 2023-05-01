package lr12;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите слова с верхним и нижним регистром:");
        String str = in.nextLine();

        List <String> strings = List.of(str.split(" "));

        List<String> stringsAfter = filterCapitalizedStrings(strings);
        System.out.println("\n" + "Строка после преобразования:" + "\n");
        for (String e:stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list){
        return list.stream()
                .filter(s->Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
