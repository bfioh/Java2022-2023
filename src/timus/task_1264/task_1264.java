package timus.task_1264;

import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        if (0<= N && N<=40000 && M>= 0 && M <=40000) {
            int total = N*(M+1);
            System.out.println(total);
        }

        }
}
