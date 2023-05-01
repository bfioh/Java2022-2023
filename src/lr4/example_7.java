package lr4;

import java.util.Scanner;

public class example_7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int line = in.nextInt();
        System.out.println("Введите количество колонок: ");
        int column = in.nextInt();
        int[][] first_mass = new int[line][column];
        int a =0; int b = 0; int num = 1;
        System.out.println("Заполненный массив Змейкой: ");
        for (int i = 0; num < first_mass.length; num++) {
            for (int j = 0; j < first_mass[i].length -a; j++) {
                //if (first_mass[i][j] ==0 ) {
                    first_mass[i][j] = b;
                    b++;
                }
            if (i < first_mass.length-1)     {  i++;  }

            for (int k = line - 1; k > a; k--){
                first_mass[k][first_mass[i].length-1-a] = b;
                b ++;
            }
            a++;
        }
        for (int i = 0; i < first_mass.length; i++) {
            for (int j = 0; j < first_mass[i].length; j++) {
                System.out.print(first_mass[i][j] + " ");
            }
            System.out.println("");
        }
    }
}