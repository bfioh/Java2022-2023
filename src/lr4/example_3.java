package lr4;

import java.util.Scanner;

public class example_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольника: ");
        int height = in.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int width = in.nextInt();
        char [] [] rectangle = new char [height][width];

        for (int i = 0; i< rectangle.length; i++){
            for (int j = 0; j< rectangle[i].length; j++){

                if (j==0 | j== width-1 | i == 0 | i == height-1) {
                    rectangle[i][j] = '2';
                    System.out.print(rectangle[i][j]);
                }

                else {System.out.print(" ");}
            }

            System.out.println("");
        }
    }
}
