package lr12;

import java.util.*;
import java.util.stream.Collectors;

public class Example_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int size = in.nextInt();

        List<Integer> ints = new ArrayList<>(size);

        Random random = new Random();
        for (int i = 0; i < size; i++)
            ints.add(random.nextInt(250));

        System.out.println("Список чисел:" + "\n" + ints);

        System.out.println("Введите число, на которое будут делиться числа из списка:");
        int num = in.nextInt();
        List<Integer> intsResult = divisionList(ints, num);

        System.out.println("Список чисел, которые делятся на заданное " +
                "число без остатка:" + "\n" + intsResult);
    }

    public static List<Integer> divisionList(List<Integer> list, int num) {
        return list.stream().filter( x->x % num ==0).collect(Collectors.toList());
    }
}
