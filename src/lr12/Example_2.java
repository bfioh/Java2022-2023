package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        int[] arr = new int[size];
        int[] arr2 = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
            arr2[i] = random.nextInt(100);
        }

        System.out.println("Массив arr:" + "\n" + Arrays.toString(arr)
                + "\n" + "Массив arr2:" + "\n" + Arrays.toString(arr2));

        int[] arrResult = findCommonElements(arr,arr2);

        System.out.println("Массив arrResult:" + "\n" + Arrays.toString(arrResult));
    }

    public static int[] findCommonElements(int[] arr, int[]arr2) {
        return Arrays.stream(arr)
                .filter(x-> Arrays.stream(arr2)
                .anyMatch(y->y==x))
                .toArray();
    }
}
