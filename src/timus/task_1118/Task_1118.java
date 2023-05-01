package timus.task_1118;

import java.util.Scanner;

public class Task_1118 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int I = in.nextInt();
        int J = in.nextInt();
        double N = 999999999;

        double[] result = new double[J - I + 1];

        for (int j = 0; j <= J - I; ) {  // цикл для записывания в массив
            for (int o = I; o <= J; o++) {  // цикл для прохождения чисел в диапазоне от I до J
                for (int i = 1; i <= J; i++) { // цикл для нахождения суммы чисел, на которые делится это число
                    if (o % i == 0 && o != i)             // если число делится без остатка, то плюсуем его
                        result[j] += i;         // в соответствующий индекс массива
                }
                j++;
            }
        }

        {
        for (int i = 0, I_dublicate = I; i < result.length; ) { //делим сумму чисел на само число
            result[i] = result[i] / I_dublicate;
            I_dublicate = I_dublicate + 1;
            i++;
        }
    }
        for (int i = 0; i < result.length; i++) {
            if (N > result[i])
                N = result[i];
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == N){
                System.out.println(I+i);
            }
        }
    }
}

