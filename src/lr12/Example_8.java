package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int size = in.nextInt();

        List<Integer> ints = new ArrayList<>(size);

        Random random = new Random();
        for (int i = 0; i < size; i++)
            ints.add(random.nextInt(250));

        System.out.println("Список чисел:" + "\n" + ints);

        System.out.println("Введите число:");
        int num = in.nextInt();
        List<Integer> intsResult = moreNumberList(ints, num);

        System.out.println("Список чисел, которые больше заданного " +
                "значения:" + "\n" + intsResult);
    }

    public static List<Integer> moreNumberList(List<Integer> list, int num) {
        return list.stream().filter( x->x > num).collect(Collectors.toList());
    }
}
