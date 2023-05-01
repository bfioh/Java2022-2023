package lr11.Example_6;

import java.util.*;
import java.util.stream.Stream;

public class Example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, String> testHashMap = new HashMap<>();

        // заполняем мапу введёнными значениями
        for (int i = 0; i != 10; i++) {
            System.out.println("Введите значение в ключ: " + i);
            String value = in.next();
            testHashMap.put(i, value);
        }
        //

        System.out.println("Значения ключей, которые больше, чем 5: " + Arrays.toString(getKeyMoreFive(testHashMap)));
        System.out.println("Значение ключа 0: " + Arrays.toString(getKeyZero(testHashMap)));
        System.out.println("Произведение ключей, значения которых длиннее 5 символов: ");
        getLengthMoreFive(testHashMap);
    }

    public static void getLengthMoreFive(Map<Integer, String> map) {

        String lenght;
        int key = 1;

        for (int i = 0; i != 10; i++) {
            lenght = map.get(i);
            if (lenght.length() > 5)
                key = key * i;
        }
        System.out.println(key);

    }

    private static String[] getKeyMoreFive(Map<Integer, String> map) {
        System.out.println();
        return map.entrySet().stream().filter(x -> x.getKey() > 5).map(Map.Entry::getValue).toArray(String[]::new);
    }

    public static String[] getKeyZero(Map<Integer, String> map) {
        return map.entrySet().stream().filter(x -> x.getKey() == 0).map(Map.Entry::getValue).toArray(String[]::new);
    }
}
