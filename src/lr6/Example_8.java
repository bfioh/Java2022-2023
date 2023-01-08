package lr6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_8 {

    static void GetAverage(int [] mass){
        double average = Arrays.stream(mass).average().getAsDouble();
        System.out.println("\n"+"Среднее значение для элементов массива = "+average);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int x = in.nextInt();
        int[] ggwp = new int[x];
        Random random = new Random();

        System.out.println("Массив, заполненный случайными числами: ");
        for (int i = 0; i < ggwp.length; i++) {
            ggwp[i] = random.nextInt(-100, 100);
            System.out.print(ggwp[i] + " ");
        }
        GetAverage(ggwp);
    }
}