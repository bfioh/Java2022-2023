package timus.task_1225;

import java.util.Scanner;

public class Task_1225 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] mas = new long[3 + n];
        mas[0] = 2;
        mas[1] = 2;
        mas[2] = 4;
        for (int i = 3; i < mas.length; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }
        System.out.println(mas[n - 1]);
    }
}

