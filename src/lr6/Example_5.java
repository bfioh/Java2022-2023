package lr6;

import java.util.Scanner;

public class Example_5 {
    static void GetSumSquare_NoRec(int x){
        int a = 1;
        int result = 0;
        for (int i = 1; i <= x; i++){
            int j = a*a;
            result +=j;
            a++;
        }
        System.out.println("Сумма квадратов введённого числа( без рекурсии) = "+result);
    }
    static int GetSumSquare_WithRec(int x) {
        if (x <= 0)
            return 0;
        if (x == 1)
            return 1;
        return x * x +  GetSumSquare_WithRec(x-1);
    }
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = in.nextInt();
        GetSumSquare_NoRec(x);
        System.out.println("Метод с рекурсией: "+GetSumSquare_WithRec(x));
    }
}
