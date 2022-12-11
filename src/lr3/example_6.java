package lr3;

import java.util.Scanner;

public class example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = in.nextInt();

        if (size <= 0){System.out.println("Введено неправильное число"); return;}

        int mass [] = new int [size];
        int num = 0;
        System.out.print("Заполненный массив: ");
        for (int i = 0;i < mass.length;){

            if (num % 5 == 2)
            {
                mass [i] = num;
                System.out.print(mass[i] + " ");
                i++;
                num ++;
            }

            else if (num % 5 != 2)       {num++;}
        }
    }
}
