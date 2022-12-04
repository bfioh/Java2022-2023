package lr2;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число не меньше 10, делящееся на 4");
        int x = in.nextInt();
        int result = x % 4;

        if (result==0 && x>10){
            System.out.println("Введённое число делится на 4 и больше 10");
        }

        else {
            System.out.println("Введённое число не соответствует требованиям");
        }
    }
}
