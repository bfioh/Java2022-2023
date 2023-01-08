package lr6;

import java.util.Random;
import java.util.Scanner;

public class Example_6 {

    static void GetMass(int [] mass, int a){
        if (a <= mass.length && a>=0){
            int[] result_mass = new int [a];
            System.out.println("Массив, содержащий " + a
                    +" первых элементов из исходного массива");

            for (int i = 0; i < result_mass.length; i++){
                result_mass[i] = mass[i];
                System.out.print(result_mass[i] + " ");
            }
        }

        else if ( a > mass.length) {
            int[] result_mass = new int [mass.length];
            System.out.println("Массив, содержит меньше элементов, чем  " + a
                    +" , копия исходного массива: ");
            for (int i = 0; i<result_mass.length; i++){
                result_mass[i] = mass[i];
                System.out.print(result_mass[i] + " ");
            }
        }
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
        GetMass(ggwp,5);
    }
}