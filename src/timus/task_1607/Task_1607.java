package timus.task_1607;

import java.util.Scanner;

public class Task_1607{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int x=in.nextInt();
        int y=in.nextInt();
        while (x>a){
            a+=b;
            if(a>x)a=x;
            x-=y;
        }
        System.out.println(Math.max(x, a));
    }
}

