package lr3;

import java.util.Scanner;

public class example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a<b){
            System.out.print(a + " ");
            for (int i = a;i<b;i++){
                i = a+1;
                System.out.print(i+ " ");
                a = a+1;
            }
            System.out.print(b);
        }
        if (a>b){
            System.out.print(b + " ");
            for (int i = b;i<a;i++){
                i = b+1;
                System.out.print(i+ " ");
                b = b+1;
            }
            System.out.print(a);
        }
    }
}
