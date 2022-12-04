package lr2;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, у которого при делении на 5 в остатке " +
                "получается 2, а при делении на 7 в остатке получается 1");
        int x = in.nextInt();
        int result1 = x % 5;
        int result2 = x % 7;

            if (result1==2){
            System.out.println("Введённое число делится на 5 с остатком 2");
        }
        else  {
                System.out.println("Введённое число не делится на 5 с остатком 2");
        }
            if (result2==1){
            System.out.println("Введённое число делится на 7 с остатком 1");
        }
        else {
            System.out.println("Введённое число не делится на 7 с остатком 1");
        }
        }



    }
