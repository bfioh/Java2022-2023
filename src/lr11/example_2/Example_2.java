package lr11.example_2;

import java.util.Scanner;

//Создать приложение с использованием рекурсии для перевода
// целого числа, введенного с клавиатуры, в двоичную систему счисления.
public class Example_2 {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b;
        String str = "";
        while (a != 0) {
            b = a % 2;
            str = b + str;
            a = a / 2;
        }
        str = reverse(str);
        System.out.print(str);
    }
}
