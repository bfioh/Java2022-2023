package timus.task_2142;

import java.util.Scanner;

public class Task_2142 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int X = in.nextInt();
        int Y = in.nextInt();
        int Z = in.nextInt();

        int any_color = 0;

        if (C > Z)
            any_color= C-Z;

        if (A < X){
            while (A<=X|any_color==0){
                A++;
                any_color--;
            }
        }

        if (B < Y){
            while (B<=Y|any_color==0){
                B++;
                any_color--;
            }
        }

        if (((A<X | B < Y)&& C < Z)|(A<X && C<Z)| (B < Y | C<Z))
            System.out.println("There are no miracles in life");
        else if ((A >=X && B >=Y) && C>=Z)
            System.out.println("It is a kind of magic");

    }
}
