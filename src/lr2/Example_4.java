package lr2;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        System.out.println("Введите число от 5 до 10 включительно");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 5 && x <=10) {
            System.out.println("Введённое число находится в диапазоне от 5 до 10 включительно");
        }
        else {
            System.out.println("Введённое число не соответствует требованиям");
        }
    }
}