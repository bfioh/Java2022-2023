package timus.task_1313;

import java.util.Scanner;

public class task_1313 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, n = sc.nextInt();
        int matr[][] = new int[n][n];
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++) {
                matr[i][j] = sc.nextInt();
            }

        for (i = 0; i < n; i++) {
            k = i;
            for (j = 0; j <= i; ++j, k--)
                System.out.print(matr[k][j] + " ");
        }
        for (i = 1; i < n; i++) {
            k = n - 1;
            for (j = i; j < n; j++, k--)
                System.out.print(matr[k][j] + " ");
        }

    }
}
