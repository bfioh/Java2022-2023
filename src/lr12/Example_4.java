package lr12;

import java.util.*;
import java.util.stream.Collectors;

public class Example_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int size = in.nextInt();

        List<Integer> ints = new ArrayList<>(size);

        Random random = new Random();
        for (int i = 0; i < size; i++)
            ints.add(random.nextInt(250));

        System.out.println("Список чисел:" + "\n" + ints);

        List<Integer> intsResult = squareList(ints);

        System.out.println("Список после возведения в квадрат:" + "\n" + intsResult);
    }

    public static List<Integer> squareList(List<Integer> list) {
        return list.stream().map(x->x*x).collect(Collectors.toList());
    }
}

