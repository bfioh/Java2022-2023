package timus.task_2012;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
//        System.out.println("Введите количество задач от 1 до 11");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>=7 && a<=11){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
