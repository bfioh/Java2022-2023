package lr4;

import java.util.Random;
import java.util.Scanner;

public class example_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int line = in.nextInt();
        System.out.println("Введите количество колонок: ");
        int column = in.nextInt();
        Random random = new Random();
        int [][] first_mass = new int [line][column];
        int [][] second_mass = new int[column][line];

        System.out.println("Заполненный массив рандомными числами: ");
        for (int i = 0; i < first_mass.length; i++){
            for (int j = 0; j < first_mass[i].length; j++){

                first_mass [i] [j] = random.nextInt(-100,100);
                System.out.print(first_mass[i][j]+" ");

            }
            System.out.println("");
        }

        System.out.println("Массив, в котором поменяны строки и колонки местами: ");
        for (int i = 0; i < second_mass.length; i++){
            for (int j = 0; j < second_mass[i].length; j++){

                second_mass [i] [j] = first_mass [j] [i];
                System.out.print(second_mass[i][j]+" ");

            }
            System.out.println("");
        }
    }
}
