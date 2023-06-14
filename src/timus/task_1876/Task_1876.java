package timus.task_1876;

import java.util.Scanner;

public class Task_1876 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int max1 = b * 2 + 40;
        int max2 = 39 * 2 + 40 + (a - 40) * 2 + 1;
        int max = Math.max(max1, max2);
        System.out.println(max);
    }
}
