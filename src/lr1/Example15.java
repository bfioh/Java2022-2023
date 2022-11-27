package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите первое число: ");
        int a = in.nextInt();
        System.out.println("введите второе число: ");
        int b = in.nextInt();
        int c = a - b;
        int d = a + b;
        System.out.println("Разность введённых чисел: " + c + "\n" + "Сумма введённых чисел: " + d);
    }
}
