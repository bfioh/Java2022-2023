package lr3;

import java.util.Random;
import java.util.Scanner;

public class example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int mass[] = new int[size];
        Random random = new Random();
        System.out.println("Числа в массиве: ");

        for (int i = 0; i < mass.length; i++) {

            mass[i] = random.nextInt(-100, 100);
            System.out.print(mass[i] + " ");
        }

        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {

            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.print("\n " + "Минимальное число в массиве: " + min + " с индексом: "  );

        for (int i = 0; i < mass.length; i++){

            if (min == mass[i]) {
                System.out.print(i+",");
            }

        }
    }
}
