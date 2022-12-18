package lr4;

import java.util.Random;
import java.util.Scanner;

public class example_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int line = in.nextInt();
        System.out.println("Введите количество колонок: ");
        int column = in.nextInt();
        Random random = new Random();
        int[][] first_mass = new int[line][column];
        int[][] second_mass = new int[line][column];

        System.out.println("Заполненный массив рандомными числами: ");
        for (int i = 0; i < first_mass.length; i++) {
            for (int j = 0; j < first_mass[i].length; j++) {

                first_mass[i][j] = random.nextInt(-100, 100);
                System.out.print(first_mass[i][j] + " ");

            }
            System.out.println("");
        }
        int line_random = random.nextInt(0,line);
        int column_random = random.nextInt(0, column);
        System.out.println("Индекс удаляемой строки = "+line_random+"; Индекс удаляемой колонки = "+column_random);
        System.out.println("Массив после удаления рандомной строки и колонки");

        for (int i = 0; i < first_mass.length; i++) {
            for (int j = 0; j < first_mass[i].length; j++) {

                if (first_mass[i][j]!= first_mass[line_random][j] && first_mass[i][j]!= first_mass[i][column_random] ) {
                    second_mass [i][j] = first_mass[i][j];
                    System.out.print(second_mass[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }
}

