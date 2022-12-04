package timus.task_1409;


import java.util.Scanner;
public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a+b;
        if (c>10)
        {c=10;}
        else {
            c=c-1;
        }
        int d=c-a;
        int f=c-b;
        System.out.println(d+" "+f);


    }
}
