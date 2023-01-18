package timus.task_1068;

import java.util.Scanner;
public class task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = 0;
        if (N == -1 ){
            result = 0;
        }
        else if (N == 1){
            result = 1;
        }
        else if (N==0){
            result =1;
        }
        else if (N==2){
            result =3;
        }
        else if (N >= -10000 && N <= 10000 ){
            if (N > 0){
                while (N != 0 ) {
                    result = N + result;
                    N -= 1;
                }
            }
            else if (N < 0){
                while (N != 2 ) {
                    result = N + result;
                    N += 1;
                }
            }
        }
        System.out.println(result);
    }
}
