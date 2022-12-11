package lr3;

import java.util.Scanner;

public class example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int a = in.nextInt();
        int b1 = 3;
        int c1 = 3;
        int mass [] = new int[a*2];

        for (int i = 0; i < mass.length;){

            {if (b1 % 5 == 2 | b1 % 3 ==1)
            {
                mass [i] = b1;
                //System.out.print(b1 + "+" );
                b1++;
                i++;
            }
            else if (b1 % 5 !=2 && b1 % 3 !=1)     {b1++;}}

            {if (c1 % 5 == 2 | c1 % 3 == 1)
            {
                mass[i] = c1;
                c1++;
                i++;
            }
            else if (c1 % 5 !=2 && c1 % 3 !=1)     {c1++; }}
        }

        int [] UniqueMass  = new int [a*2];
        int summ = 0;
        System.out.print("Числа, которые суммируются:");

        for (int i = 0; i < mass.length-1;i++) {

            for (int j = i+1; j < mass.length; j++)
            {

                if (mass[i]==mass[j]){
                    UniqueMass[i] = mass [i];
                    System.out.print(UniqueMass[i]+ "+");
                    summ = summ + UniqueMass[i];
                }
            }
        }

        System.out.print("\n" +"Сумма этих чисел: "+ summ );
    }
}
