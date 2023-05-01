package lr11.example_3;

import java.util.Scanner;

public class Example_3 {
    //Создать приложение с использованием рекурсии для перевода
// целого числа, введенного с клавиатуры, в двоичную систему счисления.


    public static int k = 0; // счётчик
    public static int[] ints;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите размер массива: ");
        int arraySize = in.nextInt();
        ints = new int[arraySize];
        //System.out.println("Заполните массив цифрами через пробел");
        start(arraySize);
        k=0;
        end(ints);
    }

    public static int[] start(int x) {
        if (k == x) return ints;
        else {
            System.out.print("Введите следующий элемент массива");

            ints[k++] = in.nextInt();
        }
        return start(x);
    }

    public static void end(int[] ints) {
        if (ints == null || ints.length == 0) {
            return;
        } else if (k < ints.length) {
                System.out.print(ints[k]+ " ");
                k++;
                end(ints);
            }
        }
    }
