package lr6;

import java.util.Arrays;
import java.util.Random;

public class Example_3 {

    static void GetMin (int [] mass) {
        int min = Arrays.stream(mass).min().getAsInt();
        System.out.println("Наименьшее значение: " + min);
    }

    static void GetMax (int [] mass) {
        int max = Arrays.stream(mass).max().getAsInt();
        System.out.println("Наибольшее значение: " + max);
    }
    static void GetAverage (int [] mass) {
        double average = Arrays.stream(mass).average().getAsDouble();
        System.out.println("Среднее значение: " + average);
    }

    public static void main(String[] args) {

        Random random = new Random();
        int [] ggwp = new int[8];

        System.out.println("Массив, заполненный случайными числами: ");
        for (int i = 0; i < ggwp.length;i++){
            ggwp [i]= random.nextInt(-100, 100);
            System.out.print(ggwp[i] + " ");
        }
        System.out.println();

        GetMin(ggwp);
        GetMax(ggwp);
        GetAverage(ggwp);
    }

}
