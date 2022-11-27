package lr1;

import java.util.Scanner;

public class Example14 {
    static int square (int d){
        return d*d;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число: ");
        int a = in.nextInt();
        int b = a - 1;
        int c = a + 1;
        int d = square(a+b+c);

        System.out.println("Число, на единицу меньше введённого: " +b);
        System.out.println("Введённое число: " + a);
        System.out.println("Число на единицу больше введённого: "+ c);
        System.out.println("Квадрат суммы первых трёх чисел: "+d);
    }
}
