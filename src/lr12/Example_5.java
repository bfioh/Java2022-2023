package lr12;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = in.nextLine();

        List<String> strings = List.of(str.split(" "));

        System.out.println("Введите подстроку, которая будет искаться в строках:");
        String substring = in.nextLine();

        List<String> stringsResult = filterStrings(strings, substring);

        System.out.println("Строки, содержащие заданную подстроку:" + "\n" + filterStrings(strings, substring));
    }

    public static List<String> filterStrings(List<String> list, String substring) {
        return list.stream()
                .filter(word-> word.contains(substring)).collect(Collectors.toList());
    }
}
