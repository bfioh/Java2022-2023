package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int mass[] = new int[size];
        Random random = new Random();
        System.out.println("Числа в массиве до сортировки: ");

        for (int i = 0; i < mass.length; i++) {

            mass[i] = random.nextInt(-100, 100);
            System.out.print(mass[i] + " ");
        }

        int min = mass[0];
        Arrays.sort(mass);
        System.out.println("\n"+"Числа в массиве после сортировки в порядке убывания: ");
        for (int i = mass.length-1; i >= 0; i--) {
                System.out.print(mass[i]+" ");
            }
        }

    }
