package timus.task_1086_DODELAT;

import java.util.Random;
import java.util.Scanner;

public class task_1086 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int k = in.nextInt();
        int a = 2;
        int mass [] = new int[k];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++){
            mass[i] = random.nextInt(2, 7);
            System.out.println(mass[i]);
        }

        int o = 2;
        for (int i = 0, j = 0; j != k; i++){
           // if ( mass[i] % 2 ==  )
        }
    }
}
