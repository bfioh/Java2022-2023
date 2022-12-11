package lr3;

import java.util.Scanner;

public class example_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int a = in.nextInt();
        int a1=1;
        int a2=1;
        int a3;
        System.out.print(a1+" "+a2 +" ");
        for (int i = 2;i < a;i++){
            a3=a1+a2;
            System.out.print(a3+" ");
            a1=a2;
            a2=a3;
        }
    }
}
