package timus.task_1084;

import java.util.Scanner;

public class Task_1084 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int x=10/(3*2);
        System.out.println(36*Math.PI);
        System.out.println(9/2 * (Math.acos(x)- Math.sqrt(1-x*x)));
    }
}