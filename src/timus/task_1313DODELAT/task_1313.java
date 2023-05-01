package timus.task_1313DODELAT;

import java.util.Random;
import java.util.Scanner;

public class task_1313 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt ();

        Random random = new Random();
        int mass [][] = new int [N][N];

        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){

                mass [i][j] = random.nextInt(1, 100);
                System.out.print(" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                int a,b;

                if ( mass[i][j] < mass[i+1][j+1]){
                    //mass
                }
            }
        }
    }
}
